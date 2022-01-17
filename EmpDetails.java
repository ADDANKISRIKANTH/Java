class EmpData{
    int empId = 121;
    String empName = "srikanth";
    String empDesignation = "Developer";
    String empTechnology = "Java";
    void getEmpData(){
        System.out.println("***Enter the emp data***");
        System.out.println("enter the empId: "+empId);
        System.out.println("enter the empName: "+empName);
        System.out.println("enter the empDesignation: "+empDesignation);
        System.out.println("enter the empTechnology: "+empTechnology);
    }
}
class EmpAddress{
    String empArea = "Mookamaidi";
    String empCity = "Palvancha";
    String empPincode = "507115";
    String empDistrict = "Bhadradri kothagudem";
    void getEmpAddess(){
        System.out.println("***Employee Address details***");
        System.out.println("employee area: "+empArea);
        System.out.println("employee city: "+empCity);
        System.out.println("employee pincode: "+empPincode);
        System.out.println("employee district: "+empDistrict);
        

    }

}
class EmpDetails{
    public static void main(String[] args){
        EmpData ed = new EmpData();
        ed.getEmpData();
        EmpAddress ea = new EmpAddress();
        ea.getEmpAddess();
       System.out.println("Thanks for your sharing valuble detailes here....");
    }
}