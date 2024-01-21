class Numbers {
  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      if(i%5!=0){
        System.out.println("Iteration skipped at "+i);
        continue;
      }
      if(i%9==0){
        System.out.println("Loop broken at "+i);
      }
      System.out.println(i);
    }
  }
}
    
