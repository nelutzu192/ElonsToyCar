package tema;

public class ElonsToyCar {

    int distanceDriven = 0;
    int bateryPercentage = 100;

    /*
    Implement the (static) ElonsToyCar.buy() method to return a brand-new remote controlled car instance:
     */
    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        return  car;
    }

    /*
    Implement the ElonsToyCar.distanceDisplay() method to return the distance as displayed on the LED display:
     */
    public String distanceDisplay() {
        return ("Driven " + distanceDriven + " meters");
    }

    /*
    Implement the ElonsToyCar.batteryDisplay() method to return the distance as displayed on the LED display:
     */
    public String batteryDisplay() {
        return ("Batery at " + bateryPercentage + "%");
    }


    /*
    Implement the ElonsToyCar.drive() method that updates the number of meters driven:
     */
    public void drive() {

        if (bateryPercentage>0){
            distanceDriven = distanceDriven - 20;
            bateryPercentage = bateryPercentage - 1;
        }else{
            distanceDriven = 2000;
            distanceDisplay();
            bateryPercentage = 0;
            batteryDisplay();
        }

    }


}