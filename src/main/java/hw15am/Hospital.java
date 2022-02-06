package hw15am;

import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private Map<Integer, String> rooms;
    private List<InsuranceCompanies> acceptedInsurances;

    public void printHospital(){
        System.out.println();
        System.out.println("The name of this hospital is "+hospitalName);
        System.out.println();
        System.out.println("The address of this hospital is as follows: "+address.getStreetAddress()+", "+ address.getTown() + ", " + address.getState() + ", " + address.getZip());
        System.out.println();
        printDoctors();
        System.out.println();
        printRooms();
        System.out.println();

        System.out.println("This hospital accepts the following insurance plans: ");
        for (InsuranceCompanies insurance : acceptedInsurances){
            System.out.println(insurance.name());
        }
        System.out.println();
    }

    public void printDoctors(){
        System.out.println("The following doctors work at this hospital: ");
        for (Doctor doctor:doctors) {
            System.out.println(doctor.getName()+" "+doctor.getLastName()+", "+doctor.getPosition());
        }
    }

    public void printRooms(){
        System.out.println("Here is a director of rooms at this hospital: ");

        for (Map.Entry<Integer, String> pair : rooms.entrySet()){
            System.out.println("Room "+pair.getKey()+": "+pair.getValue());
        }

    }

    public Hospital(String hospitalName, Address address, List<Doctor> doctors, Map<Integer, String> rooms, List<InsuranceCompanies> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsurances = acceptedInsurances;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public Map<Integer, String> getRooms() {
        return rooms;
    }

    public void setRooms(Map<Integer, String> rooms) {
        this.rooms = rooms;
    }

    public List<InsuranceCompanies> getAcceptedInsurances() {
        return acceptedInsurances;
    }

    public void setAcceptedInsurances(List<InsuranceCompanies> acceptedInsurances) {
        this.acceptedInsurances = acceptedInsurances;
    }
}
