package com.epam.mjc.stage0;

public class Bird extends Animal{

        public Bird(){
        super("blue",2,false);
    }
@Override
    public String getDescription() {
       return "This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.";
            }

    public static void main(String[] args) {
        Bird bird1 = new Bird();
        System.out.println(bird1.getDescription());
    }
    }
