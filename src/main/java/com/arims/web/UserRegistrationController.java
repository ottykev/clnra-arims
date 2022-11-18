package com.arims.web;

import com.arims.model.*;
import com.arims.service.*;
import com.arims.web.dto.LoginDto;
import com.arims.web.dto.UserRegistrationDto;
import com.arims.web.jwt.JwtProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;

import java.util.HashMap;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.security.core.AuthenticationException;

@RestController
@RequestMapping (path="api/v1/")
@CrossOrigin(origins ="*")
public class UserRegistrationController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());


    @Value("${uploadDir}")
    private String uploadFolder;
    @Autowired
    JwtProvider jwtProvider;

    private UserService userService;

    private User user;
    private final AdminService adminService;
    private final CboService cboService;

    private final FireService fireService;

    private final IllegalService illegalService;

    private final HwcService hwcService;

    private final ActivityService activityService;

    private final ArtifactService artifactService;

    private final SpecieService specieService;

    private  final PartnerService partnerService;

    private  final WildlifePpService wildlifePpService;


    private  final WaterSourcesService waterSourcesService;



    @Autowired
    private AuthenticationManager authenticationManager;


    public UserRegistrationController(UserService userService, AdminService adminService, CboService cboService, FireService fireService,
                                      IllegalService illegalService, HwcService hwcService, ActivityService activityService, ArtifactService artifactService,
                                      SpecieService specieService, PartnerService partnerService, WildlifePpService wildlifePpService, WaterSourcesService waterSourcesService) {
        super();
        this.userService = userService;
        this.adminService = adminService;
        this.cboService = cboService;
        this.fireService = fireService;
        this.illegalService = illegalService;
        this.hwcService = hwcService;
        this.activityService = activityService;
        this.artifactService = artifactService;
        this.specieService = specieService;
        this.partnerService = partnerService;
        this.wildlifePpService = wildlifePpService;
        this.waterSourcesService = waterSourcesService;
        //this.profileService = profileService;
        this.user = user;
    }

    // Admin API

    @PostMapping("/add")
    public ResponseEntity<Admin> addEmployee(@RequestBody Admin admin) {
        Admin newAdmin = adminService.add(admin);
        return new ResponseEntity<>(newAdmin, HttpStatus.CREATED);
    }

    @DeleteMapping({"/deleteAdmin/{id}"})
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        this.adminService.deleteAdmin(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping({"/updateAdmin"})
    public ResponseEntity<Admin> updateAdmin(@RequestBody Admin admin) {
        Admin updateAdmin = this.adminService.updateAdmin(admin);
        return new ResponseEntity(updateAdmin, HttpStatus.OK);
    }

    @GetMapping({"/allAdmin"})
    public ResponseEntity<List<Admin>> getAlL() {
        List<Admin> admins = this.adminService.findAllAdmin();
        return new ResponseEntity(admins, HttpStatus.OK);
    }

    @GetMapping({"/findAdmin/{id}"})
    public ResponseEntity<Admin> getAdminById(@PathVariable("id") Long id) {
        Admin admin = this.adminService.findAdminById(id);
        return new ResponseEntity(admin, HttpStatus.OK);
    }

    // Activity API


    @PostMapping("/newActivity")
    public ResponseEntity<Activity> addActivity(@RequestBody Activity activity) {
        Activity newActivity = activityService.add(activity);
        return new ResponseEntity<>(newActivity, HttpStatus.CREATED);
    }

    @DeleteMapping({"/deleteActivity/{id}"})
    public ResponseEntity<?> deleteActivity(@PathVariable("id") Long id) {
        this.activityService.deleteActivity(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping({"/updateActivity"})
    public ResponseEntity<Activity> updateActivity(@RequestBody Activity activity) {
        Activity updateActivity = this.activityService.updateActivity(activity);
        return new ResponseEntity(updateActivity, HttpStatus.OK);
    }

    @GetMapping({"/allActivity"})
    public ResponseEntity<List<Activity>> getAlLActivity() {
        List<Activity> activities = this.activityService.findAllActivity();
        return new ResponseEntity(activities, HttpStatus.OK);
    }

    @GetMapping({"/findActivity/{id}"})
    public ResponseEntity<Activity> getActById(@PathVariable("id") Long id) {
        Activity act = this.activityService.findActivityById(id);
        return new ResponseEntity(act, HttpStatus.OK);
    }

    //Human wildlife conflict


    @PostMapping("/newConflict")
    public ResponseEntity<Hwc> addConflict(@RequestBody Hwc hwc) {
        Hwc newHwc = hwcService.add(hwc);
        return new ResponseEntity<>(newHwc, HttpStatus.CREATED);
    }

    @DeleteMapping({"/deleteConflict/{id}"})
    public ResponseEntity<?> deleteConflict(@PathVariable("id") Long id) {
        this.hwcService.deleteConflict(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping({"/updateConflict"})
    public ResponseEntity<Hwc> updateConflict(@RequestBody Hwc hwc) {
        Hwc updateHwc = this.hwcService.updateConflict(hwc);
        return new ResponseEntity(updateHwc, HttpStatus.OK);
    }

    @GetMapping({"/allConflicts"})
    public ResponseEntity<List<Hwc>> getAlLConflicts() {
        List<Hwc> conflict = this.hwcService.findAllConflicts();
        return new ResponseEntity(conflict, HttpStatus.OK);
    }

    @GetMapping({"/findConflict/{id}"})
    public ResponseEntity<Hwc> getConflictById(@PathVariable("id") Long id) {
        Hwc conflicts = this.hwcService.findConflictById(id);
        return new ResponseEntity(conflicts, HttpStatus.OK);
    }


    //Fire Incidents


    @PostMapping("/addFireIncident")
    public ResponseEntity<Fire> addFireIncident(@RequestBody Fire fire) {
        Fire newFire = fireService.add(fire);
        return new ResponseEntity<>(newFire, HttpStatus.CREATED);
    }

    @DeleteMapping({"/deleteFireIncident/{id}"})
    public ResponseEntity<?> deleteFire(@PathVariable("id") Long id) {
        this.fireService.deleteFire(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping({"/updateFireIncident"})
    public ResponseEntity<Fire> updateFire(@RequestBody Fire fire) {
        Fire updateFire = this.fireService.updateFire(fire);
        return new ResponseEntity(updateFire, HttpStatus.OK);
    }

    @GetMapping({"/allFireIncidents"})
    public ResponseEntity<Object> getAlLFire() {
        List<Fire> fire = this.fireService.findAllFires();
        return new ResponseEntity(fire, HttpStatus.OK);
    }

    @GetMapping({"/findFireIncident/{id}"})
    public ResponseEntity<Fire> getFireById(@PathVariable("id") Long id) {
        Fire fire = this.fireService.findFireById(id);
        return new ResponseEntity(fire, HttpStatus.OK);
    }


    //Illegals


    @PostMapping("/addIllegalActivity")
    public ResponseEntity<Illegals> addIllegal(@RequestBody Illegals illegals) {
        Illegals newIllegal = illegalService.add(illegals);
        return new ResponseEntity<>(newIllegal, HttpStatus.CREATED);
    }

    @DeleteMapping({"/deleteIllegalActivity/{id}"})
    public ResponseEntity<?> deleteIllegal(@PathVariable("id") Long id) {
        this.illegalService.deleteIllegal(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping({"/updateIllegalActivity"})
    public ResponseEntity<Illegals> updateActivity(@RequestBody Illegals illegals) {
        Illegals updateIllegal = this.illegalService.updateIllegals(illegals);
        return new ResponseEntity(updateIllegal, HttpStatus.OK);
    }

    @GetMapping({"/allIllegalActivity"})
    public ResponseEntity<List<Illegals>> getAlLIllegals() {
        List<Illegals> illegals = this.illegalService.findAllIllegals();
        return new ResponseEntity(illegals, HttpStatus.OK);
    }

    @GetMapping({"/findIllegals/{id}"})
    public ResponseEntity<Illegals> getIllegalById(@PathVariable("id") Long id) {
        Illegals illegals = this.illegalService.findIllegalById(id);
        return new ResponseEntity(illegals, HttpStatus.OK);
    }


    //Partner API


    @PostMapping("/addPartner")
    public ResponseEntity<Partners> addPartner(@RequestBody Partners partners) {
        Partners newPartners = partnerService.add(partners);
        return new ResponseEntity<>(newPartners, HttpStatus.CREATED);
    }

    @DeleteMapping({"/deletePartner/{id}"})
    public ResponseEntity<?> deletePartner(@PathVariable("id") Long id) {
        this.partnerService.deletePartners(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping({"/updatePartner"})
    public ResponseEntity<Partners> updatePartner(@RequestBody Partners partners) {
        Partners updatePartner = this.partnerService.updatePartners(partners);
        return new ResponseEntity(updatePartner, HttpStatus.OK);
    }

    @GetMapping({"/allPartners"})
    public ResponseEntity<List<Partners>> getAlLPartners() {
        List<Partners> partners = this.partnerService.findAllPartners();
        return new ResponseEntity(partners, HttpStatus.OK);
    }

    @GetMapping({"/findPartner/{id}"})
    public ResponseEntity<Partners> getPartnerById(@PathVariable("id") Long id) {
        Partners partners = this.partnerService.findPartnerById(id);
        return new ResponseEntity(partners, HttpStatus.OK);
    }

    //Specie API


    @PostMapping("/addSpecie")
    public ResponseEntity<Species> addPartner(@RequestBody Species species) {
        Species newSpecies = specieService.add(species);
        return new ResponseEntity<>(newSpecies, HttpStatus.CREATED);
    }

    @DeleteMapping({"/deleteSpecie/{id}"})
    public ResponseEntity<?> deleteSpecie(@PathVariable("id") Long id) {
        this.specieService.deleteSpecies(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping({"/updateSpecies"})
    public ResponseEntity<Species> updatePartner(@RequestBody Species species) {
        Species species1 = this.specieService.updateSpecies(species);
        return new ResponseEntity(species1, HttpStatus.OK);
    }

    @GetMapping({"/allSpecies"})
    public ResponseEntity<List<Species>> getAlLSpecies() {
        List<Species>  species = this.specieService.findAllSpecies();
        return new ResponseEntity(species, HttpStatus.OK);
    }

    @GetMapping({"/findSpecie/{id}"})
    public ResponseEntity<Species> getSpeciesById(@PathVariable("id") Long id) {
        Species species = this.specieService.findSpecieById(id);
        return new ResponseEntity(species, HttpStatus.OK);
    }

    //Water Source API


    @PostMapping("/addWaterSource")
    public ResponseEntity<WaterSources> addWaterSource(@RequestBody WaterSources sources) {
        WaterSources newSources = waterSourcesService.add(sources);
        return new ResponseEntity<>(newSources, HttpStatus.CREATED);
    }

    @DeleteMapping({"/deleteWaterSource/{id}"})
    public ResponseEntity<?> deleteSource(@PathVariable("id") Long id) {
        this.waterSourcesService.deleteWaterSources(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping({"/updateWaterSource"})
    public ResponseEntity<WaterSources> updateWaterSource(@RequestBody WaterSources waterSources) {
        WaterSources updateSources = this.waterSourcesService.updateWaterSources(waterSources);
        return new ResponseEntity(updateSources, HttpStatus.OK);
    }

    @GetMapping({"/allWaterSource"})
    public ResponseEntity<List<WaterSources>> getAlLSources() {
        List<WaterSources> sources = this.waterSourcesService.findAllWaterSources();
        return new ResponseEntity(sources, HttpStatus.OK);
    }

    @GetMapping({"/findWaterSource/{id}"})
    public ResponseEntity<WaterSources> getSourceById(@PathVariable("id") Long id) {
        WaterSources waterSources = this.waterSourcesService.findWaterSourceById(id);
        return new ResponseEntity(waterSources, HttpStatus.OK);
    }

    //WildlifePp



    @PostMapping("/addWildlifePp")
    public ResponseEntity<WildlifePp> addWildlife(@RequestBody WildlifePp wildlifePp) {
        WildlifePp newWildlife = wildlifePpService.add(wildlifePp);
        return new ResponseEntity<>(newWildlife, HttpStatus.CREATED);
    }

    @DeleteMapping({"/deleteWildlife/{id}"})
    public ResponseEntity<?> deleteWildlife(@PathVariable("id") Long id) {
        this.wildlifePpService.deleteWildlifePp(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping({"/updateWildlife"})
    public ResponseEntity<WildlifePp> updateWildlife(@RequestBody WildlifePp wildlifePp) {
        WildlifePp life = this.wildlifePpService.updateWildlife(wildlifePp);
        return new ResponseEntity(life, HttpStatus.OK);
    }

    @GetMapping({"/allWildlife"})
    public ResponseEntity<List<WildlifePp>> getAlLWildlife() {
        List<WildlifePp> wild = this.wildlifePpService.findAllWildlife();
        return new ResponseEntity(wild, HttpStatus.OK);
    }

    @GetMapping({"/findWildlife/{id}"})
    public ResponseEntity<WildlifePp> getwildlifeById(@PathVariable("id") Long id) {
        WildlifePp wild = this.wildlifePpService.findWildlifeById(id);
        return new ResponseEntity(wild, HttpStatus.OK);
    }



    //Cbo API

    @PostMapping("/cbo")
    public ResponseEntity<Cbo> addCbo(@RequestBody Cbo cbo) {
        Cbo newCbo = cboService.add1(cbo);
        return new ResponseEntity<>(newCbo, HttpStatus.CREATED);
    }

    @DeleteMapping({"/deleteCbo/{id}"})
    public ResponseEntity<?> deleteCbo(@PathVariable("id") Long id) {
        this.cboService.deleteCbo(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping({"/updateCbo"})
    public ResponseEntity<Cbo> updateAdmin(@RequestBody Cbo cbo) {
        Cbo updateCbo = this.cboService.updateCbo(cbo);
        return new ResponseEntity(updateCbo, HttpStatus.OK);
    }

    @GetMapping({"/allCbo"})
    public ResponseEntity<Object> getAlLCbo() {
        List<Cbo> cbo = this.cboService.findAllCbo();
        return new ResponseEntity(cbo, HttpStatus.OK);
    }

    @GetMapping({"/findCbo/{id}"})
    public ResponseEntity<Cbo> getCboById(@PathVariable("id") Long id) {
        Cbo cbo = this.cboService.findCboById(id);
        return new ResponseEntity(cbo, HttpStatus.OK);
    }


    //Registration API


    @PostMapping("auth/register")
    public User register(@RequestBody UserRegistrationDto userRegistrationDto) {
        return userService.save(userRegistrationDto);
    }

    @PostMapping("auth/login")
    public ResponseEntity<Object> authenticateUser(@RequestBody LoginDto loginDto) {
        HashMap map = new HashMap();
        try {
            Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    loginDto.getEmail(), loginDto.getPassword()));

            SecurityContextHolder.getContext().setAuthentication(authentication);
            //  return loginDto;

            String jwt = jwtProvider.generateJwtToken(authentication);
//        return ResponseEntity.ok(new JwtResponse(jwt));

            map.put("success", true);
            map.put("accessToken", jwt);

        } catch (AuthenticationException e) {
            map.put("success", false);
            map.put("message", "Wrong username or password!");
            return new ResponseEntity<>(map, HttpStatus.OK);
        }
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    // Return Username
    @GetMapping(value = "/username")
    @ResponseBody
    public String currentUserName(Authentication authentication) {
        return authentication.getName();
    }


    @PutMapping({"/updateUserProfile"})
    public User updateProfile(@RequestBody User user) {
       return userService.Update(user);

    }


    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok().body(userService.getUsers());
    }

    @GetMapping({"/user/{id}"})
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
        User newUser = this.userService.findUserById(id);
        return new ResponseEntity(newUser, HttpStatus.OK);
    }


    //Roles API

    @PostMapping("/roles/save")
    public ResponseEntity<Role> saveRole(@RequestBody Role role) {
        return ResponseEntity.ok().body(userService.saveRole(role));
    }

    @PostMapping("/assignRole")
    public ResponseEntity<Role> AssignRole(@RequestBody addRoleToUserForm form) {
        userService.addRoleToUser(form.getUserName(), form.getRoleName());
        return ResponseEntity.ok().build();
    }


    @GetMapping("/roles")
    public ResponseEntity<List<Role>> getRoles() {
        return ResponseEntity.ok().body(userService.getRoles());
    }


// Cart API

    @PostMapping({"/addArt"})
    public ResponseEntity<Artifact> addArtifact(@RequestBody Artifact artifact) {
        Artifact addArtifact = this.artifactService.newArt(artifact);
        return new ResponseEntity(addArtifact, HttpStatus.CREATED);
    }

    @DeleteMapping({"/deleteArt/{id}"})
    public ResponseEntity<?> deleteArt(@PathVariable("id") Long id) {
        this.artifactService.deleteArtifact(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping({"/updateArt"})
    public ResponseEntity<Artifact> updateArt(@RequestBody Artifact artifact) {
        Artifact updateArt = this.artifactService.updateArtifact(artifact);
        return new ResponseEntity(updateArt, HttpStatus.OK);
    }

    @GetMapping({"/allArt"})
    public ResponseEntity<List<Artifact>> getAlLArt() {
        List<Artifact> art = this.artifactService.findAllArtifact();
        return new ResponseEntity(art, HttpStatus.OK);
    }


    @GetMapping({"/findArtifact/{id}"})
    public ResponseEntity<Artifact> getArtById(@PathVariable("id") Long id) {
        Artifact art = this.artifactService.findArtifactById(id);
        return new ResponseEntity(art, HttpStatus.OK);
    }




}

        @Data
        class addRoleToUserForm {
            String userName;
            String roleName;

}

