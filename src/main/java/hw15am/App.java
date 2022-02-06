package hw15am;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        // create hospital address
        Address hospitalAddress = new Address("1733 Oak St", "Johnsville", "TX", 76051);

        // create all doctors and add them to doctors list
        List<Doctor> doctors = new ArrayList<>();
        Doctor firstDoctor = new Doctor("John", "Smith", Position.DENTIST);
        doctors.add(firstDoctor);
        Doctor secondDoctor = new Doctor("David", "Johnson", Position.FAMILY);
        doctors.add(secondDoctor);
        Doctor thirdDoctor = new Doctor("Chris", "Simpson", Position.EYE);
        doctors.add(thirdDoctor);
        Doctor fourthDoctor = new Doctor("Michael", "Grover", Position.SCIENTIST);
        doctors.add(fourthDoctor);
        Doctor fifthDoctor = new Doctor("Ian", "Presley", Position.SURGEON);
        doctors.add(fifthDoctor);

        // create map of rooms
        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(100, "Reception");
        rooms.put(200, "Examination");
        rooms.put(300, "Surgery");
        rooms.put(400, "Recovery");

        // create list of accepted insurance
        List<InsuranceCompanies> acceptedInsurance = new ArrayList<>();
        acceptedInsurance.add(InsuranceCompanies.Anthem);
        acceptedInsurance.add(InsuranceCompanies.Humana);
        acceptedInsurance.add(InsuranceCompanies.KaiserFoundation);
        acceptedInsurance.add(InsuranceCompanies.UnitedHealth);

        // create the hospital object
        Hospital newHospital = new Hospital("New Hospital", hospitalAddress, doctors, rooms, acceptedInsurance);

        // print all the fields in the hospital
        newHospital.printHospital();

        // print all the doctors in the hospital
        newHospital.printDoctors();

        // print all the rooms in the hospital
        newHospital.printRooms();




    }
}

