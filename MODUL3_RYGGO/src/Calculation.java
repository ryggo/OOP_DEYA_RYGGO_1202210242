public class Calculation implements Runnable {
    public double radius;
    public double side;
    public double area;
    public double phi = 3.14;
    
    public void setSquare(double side) {
        this.side = side;
            try {
                if (side < 1){
                    throw new IllegalArgumentException("panjang sisi tidak boleh kurang dari 1");
                } else {
                    area = side * side;
                }
            } catch (NumberFormatException e) {
                e.getMessage();
            }
    }
    
    public double getSquare() {
        return area;
    }
    
    public void setCircle( double radius) {
        this.radius = radius;
            try {
                if (radius < 1){
                       throw new IllegalArgumentException("panjang radius tidak boleh kurang dari 1");
                } else {
                    area = phi * radius;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
    }

    public double getCircle(){
        return area;
    }
    
    public void setTrapezoid(double a, double b, double t) {
            try {
                if (a < 1|| b < 1|| t < 1){
                    throw new IllegalArgumentException("panjang sisi tidak boleh kurang dari 1");
                } else {
                    area = ((a + b) * t)/2;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
    }
    public double getTrapezoid(){
        return area;
    }
    
    @Override
    public void run(){
        System.out.println("===== Program will start in =====");
        for (int i = 3; i > 0; i --)
            try {
                System.out.println("Starting with thread "+i);
                Thread.sleep(1500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
    } 
}

