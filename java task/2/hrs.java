class HRSsys{
    int empID;
    String name;
    
    HRSsys(int empID,String name){
        this.empID=empID;
        this.name=name;
    }
    void display(){
        System.out.println("employee id is "+empID);
        System.out.println("employee name is "+name);
    }
}

public class hrs {
    public static void main(String[] args) {
        HRSsys s1=new HRSsys(554, "VISHAL SHINDE");
        s1.display();
    }
}
