package Interface.Interface7.Sub3;

import Interface.Interface7.Sub.IModel;
import Interface.Interface7.Sub2.Model;

public class ShowSystemMode extends Model{
    public ShowSystemMode(){
        //super();
    }
 
    public IModel hibernate(ShowSystemMode ssm){
         //Model model=new Model();
         Model.Mode mode=ssm.new Mode();
         return mode;
     }
 
     public static void main(String[] args) {
         ShowSystemMode ssm=new ShowSystemMode();
         System.out.println(ssm.hibernate(ssm));
     }
    
}
