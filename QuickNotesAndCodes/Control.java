class Control{
    public static void main(String[] args) {
        int marks = 99;
        // One way to indicate if else loops
        if(marks > 90){
            System.out.println("good boy");
        }
        else{
            System.out.println("Try hard!");
        }


        // Same thing can be written as
        System.out.println(marks > 90 ? "Good boy":"Goo! But try hard");


        //switch case
        String name = "Busi";
        switch(name){
            case "Busi":
                System.out.println("Busi");
                break;
            case "Shamu":
                System.out.println("Shamu");
                break;
            default:
                System.out.println("Someone new");
        }


        //for loop
        for(int i=0 ; i< 10; i++){
            // ignore 3 case
            if(i==3)
                continue;
            System.out.println("Square of "+i+" is "+i*i);
        }
        int pointer = 0;
        while(pointer < 10){
            System.out.println("Pointer: "+pointer);
            pointer+=1;
        }
    }
}