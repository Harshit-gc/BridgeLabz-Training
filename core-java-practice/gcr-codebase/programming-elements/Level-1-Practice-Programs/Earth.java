public class Earth {
    public static void main(String[] args) {
        int RAD_KM = 6378; // Radius in Kilometer
        float RAD_M = RAD_KM*0.62f; // Radius in Miles
        float vol1 = (4.0f/3.0f)*3.14f*RAD_KM*RAD_KM*RAD_KM;
        float vol2 = (4.0f/3.0f)*3.14f*RAD_M*RAD_M*RAD_M;
        System.out.println("The volume of earth in cubic kilometers is "+vol1+" and cubic miles is "+vol2);
    }
}
