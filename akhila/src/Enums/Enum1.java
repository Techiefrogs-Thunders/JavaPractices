package Enums;

public class Enum1 {
    public enum Days{Sunday , Monday , Tuesday , Wednesday , Thursday , Friday , Saturday }
    public static void main(String[] args) {
        for(Days d:Days.values()){
            System.out.print(d+",");
        }
        System.out.println();
        System.out.println(Days.valueOf("Monday"));
        System.out.println(Days.valueOf("Monday").ordinal());
    }
}
enum Season{spring,rainy,winter,sumner}
 class EnumEg {
    public static void main(String[] args) {
        Season s=Season.spring;
        System.out.println(s.ordinal());
    }
}
//values(): used to get an array of all predefined constant values in an Enum type
//returns an array containing all the valuess of the enum.
//valueOf(): returns the enum constant of the specified enumtype with the specified name.
//returns values
//ordinal(): returns the ordinal of this enumeration constant.
//returns index value
//Java compiler internally adds values(), valueOf() and ordinal() methods within the enum at compile time. It internally creates a static and final class for the enum.
//semicolon(;) is optional after the end of the enum statement
//enum can be defined outside the class
//Constructor of enum type is private. If you don't declare private compiler internally creates private constructor.
//value : gives the particular value given to the particular string

