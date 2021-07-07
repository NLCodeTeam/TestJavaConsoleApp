package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car(new ElectricEngine());
        Car2 car2 = new Car2();
    }
    static class Validator {
        protected boolean validate(String text) {
            return true;
        }
    }

    static class EmailValidator extends Validator {
        @Override
        protected boolean validate(String text) {
            if (text == null) return false;
            return true;
        }
    }

    static class Car {
        private Engine engine;

        public Car(Engine engine) {
            this.engine = engine;
        }
    }

    static class Car2 {
        private Engine engine;

        public Car2() {
            this.engine = new Engine();
        }
    }

    static class Engine {

    }

    static class ElectricEngine extends Engine {

    }

    static class GasEngine extends Engine {

    }

    static class DizelEngine extends Engine {

    }
}
