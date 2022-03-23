class Teacher {
    //Implement your code here
    public String []teacherName;
    public String []subject;
    public double []salary;
    public Teacher(String []teacherName,String []subject,double []salary){
         this.teacherName=teacherName;
         this.subject=subject;
         this.salary=salary;
            }
    
    // public String []getTeacherName(){
    //     return teacherName;
    // }
    // public void setTeacherName(String []teacherName){
    //     this.teacherName=teacherName;
    // }
    
    // public String []getSubject(){
    //     return subject;
    // }
    // public void setSubject(String []subject){
    //     this.subject=subject;
    // }
    
    // public double []getSalary(){
    //     return salary;
    // }
    // public void setSalary(double []salary){
    //     this.salary=salary;
    // }
    
    public void displaydetails(){
        for(int i=0;i<this.teacherName.length;i++){
            System.out.println("Name  :  "+this.teacherName[i]+","+ "Subject  :  "+this.subject[i]+ ","+"Salary : "+salary[i]);
            System.out.println();
        }
    }
    
}

class Tester {
	public static void main(String[] args) {
	    // Implement your code here
	    String []teacherName={"Alex","John","Sam","Maria"};
	    String []subject={"Java Fundamentals","RDBMS","Networking","Python"};
	    double []salary={1200l,800l,900l,900l};
	    Teacher teacher1=new Teacher(teacherName,subject,salary);
	    teacher1.displaydetails();
	    
	}
}