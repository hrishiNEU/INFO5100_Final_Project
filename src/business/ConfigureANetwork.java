/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import business.enterprise.EnterpriseDirectory;
import business.organization.CommunityOrganization;
import business.organization.DamageAssesmentDepartment;
import business.organization.EmergencyOperationsCenter;
import business.organization.FieldResponseUnit;
import business.organization.HealthCareInstitution;
import business.organization.LogisticsSupplyChainUnit;
import business.organization.Organization;
import business.organization.OrganizationDirectory;
import business.organization.ResourceManagementDivision;
import business.organization.ResponseTeamUnit;
import business.role.Citizen;
import business.role.CitizenDirectory;
import business.role.DamageAnalyst;
import business.role.EmergencyOperationCoordinator;
import business.role.FieldResponseCoordinator;
import business.role.HospitalManager;
import business.role.LogisticsCoordinator;
import business.role.ResourceSpecialist;
import business.role.ResponseTeamAgent;
import business.role.ResponseTeamCoordinator;
import business.role.VolunteerCoordinator;
import java.util.ArrayList;

/**
 *
 * @author abhis
 */
public class ConfigureANetwork {

    public static Network initialize() {

        Network idrn = new Network("International Disaster Response Network");

        EnterpriseDirectory enterpriseDirectory = idrn.getEnterprisedirectory();

        enterpriseDirectory.newEnterprise("National Emergency Management Authority");
        enterpriseDirectory.newEnterprise("International Humanitarian Aid Corporation");
        enterpriseDirectory.newEnterprise("Global Resource Distribution Group");
        enterpriseDirectory.newEnterprise("Community");
        enterpriseDirectory.newEnterprise("Emergency Response Systems Ltd");

        OrganizationDirectory organizationDirectory1 = new OrganizationDirectory(enterpriseDirectory.findEnterprise("National Emergency Management Authority"));
        OrganizationDirectory organizationDirectory2 = new OrganizationDirectory(enterpriseDirectory.findEnterprise("International Humanitarian Aid Corporation"));
        OrganizationDirectory organizationDirectory3 = new OrganizationDirectory(enterpriseDirectory.findEnterprise("Global Resource Distribution Group"));
        OrganizationDirectory organizationDirectory4 = new OrganizationDirectory(enterpriseDirectory.findEnterprise("Community"));
        OrganizationDirectory organizationDirectory5 = new OrganizationDirectory(enterpriseDirectory.findEnterprise("Emergency Response Systems Ltd"));

        CitizenDirectory citizenDirectory = new CitizenDirectory();

        Citizen lewisHamilton = citizenDirectory.newCitizen(1, "Lewis Hamilton", "password123".toCharArray(), "VolunteerCoordinator",
                "1234567890", "Silverstone, UK", "British");
        Citizen maxVerstappen = citizenDirectory.newCitizen(2, "Max Verstappen", "password123".toCharArray(), "DamageAnalyst",
                "9876543210", "Zandvoort, Netherlands", "Dutch");
        Citizen charlesLeclerc = citizenDirectory.newCitizen(3, "Charles Leclerc", "password123".toCharArray(), "EmergencyOperationCoordinator",
                "5555555555", "Monaco", "Monegasque");
        Citizen sergioPerez = citizenDirectory.newCitizen(4, "Sergio Perez", "password123".toCharArray(), "MedicalAdvisor",
                "1112223333", "Guadalajara, Mexico", "Mexican");
        Citizen carlosSainz = citizenDirectory.newCitizen(5, "Carlos Sainz", "password123".toCharArray(), "SafetyInspector",
                "4445556666", "Madrid, Spain", "Spanish");
        Citizen landoNorris = citizenDirectory.newCitizen(6, "Lando Norris", "password123".toCharArray(), "LogisticsManager",
                "7778889999", "Bristol, UK", "British");
        Citizen georgeRussell = citizenDirectory.newCitizen(7, "George Russell", "password123".toCharArray(), "DisasterResponsePlanner",
                "1231231234", "Kings Lynn, UK", "British");
        Citizen fernandoAlonso = citizenDirectory.newCitizen(8, "Fernando Alonso", "password123".toCharArray(), "SearchAndRescueLeader",
                "2223334444", "Oviedo, Spain", "Spanish");
        Citizen sebastianVettel = citizenDirectory.newCitizen(9, "Sebastian Vettel", "password123".toCharArray(), "EnvironmentalSpecialist",
                "5556667777", "Heppenheim, Germany", "German");
        Citizen valtteriBottas = citizenDirectory.newCitizen(10, "Valtteri Bottas", "password123".toCharArray(), "ResourceManager",
                "8889990000", "Nastola, Finland", "Finnish");

        VolunteerCoordinator volunteerCoordinator = new VolunteerCoordinator(
                lewisHamilton.getCitizenId(),
                lewisHamilton.getName(),
                lewisHamilton.getPassword(),
                lewisHamilton.getType(),
                lewisHamilton.getPhone(),
                lewisHamilton.getAddress(),
                lewisHamilton.getNationality(),
                "Team Mercedes Volunteers",
                20,
                "UK Operations"
        );

        DamageAnalyst damageAnalyst = new DamageAnalyst(
                maxVerstappen.getCitizenId(),
                maxVerstappen.getName(),
                maxVerstappen.getPassword(),
                maxVerstappen.getType(),
                maxVerstappen.getPhone(),
                maxVerstappen.getAddress(),
                maxVerstappen.getNationality(),
                "Structural Engineering",
                "ISO Certified Damage Analyst",
                5
        );

        EmergencyOperationCoordinator emergencyCoordinator = new EmergencyOperationCoordinator(
                charlesLeclerc.getCitizenId(),
                charlesLeclerc.getName(),
                charlesLeclerc.getPassword(),
                charlesLeclerc.getType(),
                charlesLeclerc.getPhone(),
                charlesLeclerc.getAddress(),
                charlesLeclerc.getNationality(),
                "Europe-wide Calamities",
                "Satellite-based Communication",
                7
        );

        FieldResponseCoordinator fieldReponseCoordinator = new FieldResponseCoordinator(
                sergioPerez.getCitizenId(),
                sergioPerez.getName(),
                sergioPerez.getPassword(),
                sergioPerez.getType(),
                sergioPerez.getPhone(),
                sergioPerez.getAddress(),
                sergioPerez.getNationality(),
                "Central Mexico",
                5,
                "Satellite Communication"
        );

        HospitalManager hospitalManager = new HospitalManager(
                carlosSainz.getCitizenId(),
                carlosSainz.getName(),
                carlosSainz.getPassword(),
                carlosSainz.getType(),
                carlosSainz.getPhone(),
                carlosSainz.getAddress(),
                carlosSainz.getNationality(),
                "Madrid City Hospital",
                150,
                " Patient Care Policy"
        );

        LogisticsCoordinator logisticsCoordinator = new LogisticsCoordinator(
                landoNorris.getCitizenId(),
                landoNorris.getName(),
                landoNorris.getPassword(),
                landoNorris.getType(),
                landoNorris.getPhone(),
                landoNorris.getAddress(),
                landoNorris.getNationality(),
                1001
        );

        ResourceSpecialist resourceSpecialist = new ResourceSpecialist(
                georgeRussell.getCitizenId(),
                georgeRussell.getName(),
                georgeRussell.getPassword(),
                georgeRussell.getType(),
                georgeRussell.getPhone(),
                georgeRussell.getAddress(),
                georgeRussell.getNationality(),
                639001.99
        );

        ResponseTeamAgent agent1 = new ResponseTeamAgent(11, "Agent 1", "password123".toCharArray(), "ResponseTeamAgent", "1231111111", "City A", "Country A", "Boston", "Support Evacuation");
        ResponseTeamAgent agent2 = new ResponseTeamAgent(12, "Agent 2", "password123".toCharArray(), "ResponseTeamAgent", "1232222222", "City B", "Country B", "Boston", "Medical Assistance");
        ResponseTeamAgent agent3 = new ResponseTeamAgent(13, "Agent 3", "password123".toCharArray(), "ResponseTeamAgent", "1233333333", "City C", "Country C", "Boston", "Coordinate Rescue");
        ResponseTeamAgent agent4 = new ResponseTeamAgent(14, "Agent 4", "password123".toCharArray(), "ResponseTeamAgent", "1234444444", "City D", "Country D", "Boston", "Search Operations");
        ResponseTeamAgent agent5 = new ResponseTeamAgent(15, "Agent 5", "password123".toCharArray(), "ResponseTeamAgent", "1235555555", "City E", "Country E", "Boston", "Distribute Supplies");
        ResponseTeamAgent agent6 = new ResponseTeamAgent(16, "Agent 6", "password123".toCharArray(), "ResponseTeamAgent", "1236666666", "City F", "Country F", "Boston", "Communication Setup");
        ResponseTeamAgent agent7 = new ResponseTeamAgent(17, "Agent 7", "password123".toCharArray(), "ResponseTeamAgent", "1237777777", "City G", "Country G", "Boston", "Traffic Management");
        ResponseTeamAgent agent8 = new ResponseTeamAgent(18, "Agent 8", "password123".toCharArray(), "ResponseTeamAgent", "1238888888", "City H", "Country H", "Boston", "Safety Monitoring");

// Add the agents to the ResponseTeamCoordinator
        ArrayList<ResponseTeamAgent> teamAgents = new ArrayList<>();
        teamAgents.add(agent1);
        teamAgents.add(agent2);
        teamAgents.add(agent3);
        teamAgents.add(agent4);
        teamAgents.add(agent5);
        teamAgents.add(agent6);
        teamAgents.add(agent7);
        teamAgents.add(agent8);

// Create a new ResponseTeamCoordinator with the teamAgents
        ResponseTeamCoordinator newResponseCoordinator = new ResponseTeamCoordinator(
                19, // Unique ID for the new ResponseTeamCoordinator
                "New Coordinator",
                "password123".toCharArray(),
                "ResponseTeamCoordinator",
                "9870000000",
                "Boston",
                "Country X",
                "Advanced Response Strategy",
                teamAgents,
                "Headquarters"
        );

// Update the ResponseTeamUnit
        

//        ResponseTeamCoordinator responseCoordinator = new ResponseTeamCoordinator(
//                fernandoAlonso.getCitizenId(),
//                fernandoAlonso.getName(),
//                fernandoAlonso.getPassword(),
//                fernandoAlonso.getType(),
//                fernandoAlonso.getPhone(),
//                fernandoAlonso.getAddress(),
//                fernandoAlonso.getNationality(),
//                "Response Strategy",
//                10,
//                "Boston"
//        );
//
//        ResponseTeamAgent responseTeamAgent = new ResponseTeamAgent(
//                sebastianVettel.getCitizenId(),
//                sebastianVettel.getName(),
//                sebastianVettel.getPassword(),
//                sebastianVettel.getType(),
//                sebastianVettel.getPhone(),
//                sebastianVettel.getAddress(),
//                sebastianVettel.getNationality(),
//                "Boston",
//                "Evacuate Citizens"
//        );
        Organization communityOrg = organizationDirectory4.newOrganization(0, "Community Helpers", "123 Main Street", "Springfield", "Illinois", "USA");
        Organization emergencyOperationsOrg = organizationDirectory1.newOrganization(1, "Emergency Operations Center",
                "456 Elm Street",
                "Springfield",
                "Illinois",
                "USA"
        );

        Organization resourceMngOrg = organizationDirectory3.newOrganization(
                2,
                "Resource Management Division",
                "789 Pine Avenue",
                "Springfield",
                "Illinois",
                "USA"
        );

        Organization fieldOrg = organizationDirectory2.newOrganization(
                3,
                "Field Response Unit",
                "321 Oak Drive",
                "Springfield",
                "Illinois",
                "USA"
        );

        Organization damageAssessmentOrg = organizationDirectory1.newOrganization(
                4,
                "Damage Assessment Department",
                "654 Maple Lane",
                "Springfield",
                "Illinois",
                "USA"
        );

        Organization logisticsOrg = organizationDirectory3.newOrganization(
                5,
                "Logistics and Supply Chain Unit",
                "987 Cedar Road",
                "Springfield",
                "Illinois",
                "USA"
        );

        Organization healthOrg = organizationDirectory5.newOrganization(
                6,
                "Healthcare Institutions",
                "147 Birch Street",
                "Springfield",
                "Illinois",
                "USA"
        );

        Organization responseTeamOrg = organizationDirectory5.newOrganization(
                8,
                "Response Team Unit",
                "369 Cherry Boulevard",
                "Springfield",
                "Illinois",
                "USA"
        );

        CommunityOrganization communityOrganization = new CommunityOrganization(communityOrg, volunteerCoordinator, valtteriBottas);
        DamageAssesmentDepartment damageAssessmentDepartment = new DamageAssesmentDepartment(damageAssessmentOrg, damageAnalyst);
        EmergencyOperationsCenter emergencyOperationsCenter = new EmergencyOperationsCenter(emergencyOperationsOrg, emergencyCoordinator);
        FieldResponseUnit fieldResponseUnit = new FieldResponseUnit(fieldOrg, fieldReponseCoordinator);
        HealthCareInstitution healthCare = new HealthCareInstitution(healthOrg, hospitalManager);
        LogisticsSupplyChainUnit logisiticsSupplyChain = new LogisticsSupplyChainUnit(logisticsOrg, logisticsCoordinator);
        ResourceManagementDivision resourceDiv = new ResourceManagementDivision(resourceMngOrg, resourceSpecialist);
        ResponseTeamUnit updatedResponseUnit = new ResponseTeamUnit(responseTeamOrg, newResponseCoordinator, agent1);
        
        System.out.println("Network:");
        System.out.println(idrn.getNetworkname());
        System.out.println();

        System.out.println("1. Enterprise: National Emergency Management Authority");
        System.out.println("Organizations:");
        System.out.println("Emergency Operations Center");
        System.out.println("Role: Emergency Operations Coordinator - "
                + emergencyOperationsCenter.getEoc().getName()
                + " (Citizen ID: " + emergencyOperationsCenter.getEoc().getCitizenId() + ")");
        System.out.println("Damage Assessment Department");
        System.out.println("Role: Damage Analyst - "
                + damageAssessmentDepartment.getDa().getName()
                + " (Citizen ID: " + damageAssessmentDepartment.getDa().getCitizenId() + ")");
        System.out.println();

        System.out.println("2. Enterprise: International Humanitarian Aid Corporation");
        System.out.println("Organizations:");
        System.out.println("Field Response Unit");
        System.out.println("Role: Field Response Coordinator - "
                + fieldResponseUnit.getFrc().getName()
                + " (Citizen ID: " + fieldResponseUnit.getFrc().getCitizenId() + ")");
        System.out.println();

        System.out.println("3. Enterprise: Global Resource Distribution Group");
        System.out.println("Organizations:");
        System.out.println("Resource Management Division");
        System.out.println("Role: Resource Specialist - "
                + resourceDiv.getRs().getName()
                + " (Citizen ID: " + resourceDiv.getRs().getCitizenId() + ")");
        System.out.println("Logistics and Supply Chain Unit");
        System.out.println("Role: Logistics Coordinator - "
                + logisiticsSupplyChain.getLoc().getName()
                + " (Citizen ID: " + logisiticsSupplyChain.getLoc().getCitizenId() + ")");
        System.out.println();

        System.out.println("4. Enterprise: Community");
        System.out.println("Organizations:");
        System.out.println("Community Helpers");
        System.out.println("Role: Volunteer Coordinator - "
                + communityOrganization.getVc().getName()
                + " (Citizen ID: " + communityOrganization.getVc().getCitizenId() + ")");
        System.out.println("Role: Citizen - "
                + communityOrganization.getC().getName()
                + " (Citizen ID: " + communityOrganization.getC().getCitizenId() + ")");
        System.out.println();

        System.out.println("5. Enterprise: Emergency Response Systems Ltd");
        System.out.println("Organizations:");
        System.out.println("Healthcare Institutions");
        System.out.println("Role: Hospital Manager - "
                + healthCare.getHos().getName()
                + " (Citizen ID: " + healthCare.getHos().getCitizenId() + ")");
        System.out.println("Response Team Unit");
//        System.out.println("Role: Response Team Coordinator - "
//                + responseUnit.getRtc().getName()
//                + " (Citizen ID: " + responseUnit.getRtc().getCitizenId() + ")");
//        System.out.println("Role: Response Team Agent - "
//                + responseUnit.getRta().getName()
//                + " (Citizen ID: " + responseUnit.getRta().getCitizenId() + ")");

        return idrn;

    }
}
