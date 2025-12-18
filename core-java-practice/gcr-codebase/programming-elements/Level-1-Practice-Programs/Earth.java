public class Earth {
    public static void main(String[] args) {
        int rad1 = 6378; // Radius in Kilometer
        float rad2 = rad1*0.62f;
        float vol1 = (4.0f/3.0f)*3.14f*rad1*rad1*rad1;
        float vol2 = (4.0f/3.0f)*3.14f*rad2*rad2*rad2;
        System.out.println("The volume of earth in cubic kilometers is "+vol1+" and cubic miles is "+vol2);
    }
}
