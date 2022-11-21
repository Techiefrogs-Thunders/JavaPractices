package Abstraction;

abstract class Marks {
    public abstract int getPercentage();
}

class John extends Marks{
    private int java;
    private int python;
    private int php;

    public John(int java, int python, int php) {
        this.java = java;
        this.python = python;
        this.php = php;
    }

    @Override
    public int getPercentage() {
        int percentage= (java+python+php)/3;
        return percentage;
    }
}

class Tom extends Marks{
    private int java;
    private int python;
    private int php;
    private int dotnet;

    public Tom(int java, int python, int php, int dotnet) {
        this.java = java;
        this.python = python;
        this.php = php;
        this.dotnet = dotnet;
    }

    @Override
    public int getPercentage() {
        return (java+python+php+dotnet)/4;
    }
}
public class Abstraction3 {
    public static void main(String[] args) {
        John john=new John(90,75,70);
        System.out.println("The percentage of John among three Subjects: "+john.getPercentage()+"%.");
        Tom tom=new Tom(91,80,75,85);
        System.out.println("The percentage of Tom among four Subjects: "+tom.getPercentage()+"%.");
    }
}
