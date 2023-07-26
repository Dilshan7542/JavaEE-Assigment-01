package lk.ijse.pos.bo;

public class FactoryBO {
    private static FactoryBO factoryBO;
    private FactoryBO() {}
 public static FactoryBO getInstance(){
        return factoryBO==null ? new FactoryBO():factoryBO;
 }
/* public SuperBO getBO(BOType boType){

 }*/

}
