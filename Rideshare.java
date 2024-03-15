public class Rideshare {
    // Add your class members and methods here
    publice static void main(String[] args) {
        // Add your code here
        //create objects for the drivers
        int firstDriverArriveTime;
        int secondDriverArriveTime;
        int thirdDriverArriveTime;

        //passenger location with coordinates x and y
        int passengerX = 3;
        int passengerY = 4;

        //firstDriver location with distance from passenger
        int driver1X = 5;
        int driver1Y = 6;
        int firstDriverDistance =Math.abs(passengerX - driver1X) + Math.abs(passengerY - driver1Y);

        //secondDriver location with distance from passenger
        int driver2X = 5;
        int driver2Y = 6;
        int secondDriverDistance =Math.abs(passengerX - driver2X) + math.abs(passengerY - driver2Y);

        //thirdDriver location with distance from passenger
        int driver3X = 5;
        int driver3Y = 6;
        int thirdDriverDistance =Math.abs(passengerX - driver3X) + Math.abs(passengerY - driver3Y);

        //find the closest driver
        if (firstDriverDistance < secondDriverDistance && firstDriverDistance < thirdDriverDistance){
            firstDriverArriveTime = firstDriverDistance/2;
            System.out.println("Driver 1 is the closest" + " and will arrive in " + firstDriverArriveTime + " minutes");
        } else if (secondDriverDistance < firstDriverDistance && secondDriverDistance < thirdDriverDistance){
            secondDriverArriveTime = secondDriverDistance/2;
            System.out.println("Driver 2 is the closest" + " and will arrive in " + secondDriverArriveTime + " minutes");
        } else{
            System.out.println("Driver 3 is the closest" + " and will arrive in " + thirdDriverArriveTime + " minutes");
        
        }

    


     
    }
}
