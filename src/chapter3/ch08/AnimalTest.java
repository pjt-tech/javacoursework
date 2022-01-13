package chapter3.ch08;

import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 걷습니다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 걷습니다.");
    }
    public void hunting() {
        System.out.println("호랑이가 사냥을 시작합니다.");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아 다닙니다.");
    }
    public void flying() {
        System.out.println("독수리가 날개를 쭉 펴고 날아다닙니다.");
    }
}

public class AnimalTest {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        AnimalTest animalTest = new AnimalTest();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(hAnimal);
        animals.add(tAnimal);
        animals.add(eAnimal);
        for (Animal animal1 : animals) {
            animalTest.moveAnimal(animal1);
        }
        animalTest.testDownCasting(animals);
    }

    //다운캐스팅은 원래의 형태로 타입을 돌림 .. 명시적으로 해줘야함
    public void testDownCasting(ArrayList<Animal> list) {
        for (Animal animal : list) {
            //instanceof 는 왼쪽타입이 오른쪽타입이 맞는지 확인하는 것.. true false를 반환
            if(animal instanceof Human) {
                Human human = (Human) animal;
                human.move();
            } else if(animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            } else if(animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.flying();
            } else {
                animal.move();
            }
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
