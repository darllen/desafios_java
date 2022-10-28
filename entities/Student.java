package entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade(){
        return grade1 + grade2 + grade3;
    }

    public String result(){
        double aux = finalGrade();
        if (aux >= 60){
            return "PASS";
        } else {
            return "FAILED\n"
                    + "MISSING "
                    + String.format("%.2f",60-aux)
                    + " POINTS";
        }

    }

}
