public class Person{
  private int age;
  private int wisdom;
  private int fitness;

  public Person(int inputAge){
    this.age = inputAge;
    this.wisdom = inputAge * 5;
    this.fitness = 100 - inputAge;
  }

  public void setAge(int newAge){
    this.age = newAge;
  }

  public void setWisdom(int newWisdom){
    this.wisdom = newWisdom;
  }

  public void setFitness(int newFitness){
    this.fitness = newFitness;
  }

  public void hasBirthday(){
    this.setAge(this.age+1);
    this.setWisdom(this.wisdom+5);
    this.setFitness(this.fitness-3);
  }
  public int getAge(){
    return this.age;
  }

  public int getFitness(){
    return this.fitness;
  }
  public int getWisdom(){
    return this.wisdom;
  }

  public static void main(String[] args){
    Person emily = new Person(20);
    emily.hasBirthday();
    System.out.println("New age is: " + emily.getAge());
    System.out.println("New wisdom is: " + emily.getWisdom());
    System.out.println("New fitness is: " + emily.getFitness());
  }
}
