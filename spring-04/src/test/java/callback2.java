public class callback2 {
}
   class Son {

              public void sleep(Mother m,int time){
                     System.out.println("son:我要睡觉了");
                     m.call(this,time);//告诉妈妈多久叫醒自己
                 }

             public void aware(){
                    System.out.println("son:我醒了");
               }
 }
   class Mother {

              //这里简单起见使用的是用i判断
             public void call(Son s,int time){
                    int i=0;
                    while(i++==time);
                     System.out.println(i+"小时过去了");
                     System.out.println("mother:时间到了，该叫儿子起床了");
                     s.aware();//回调
                 }

         }

         class Test1{
             public static void main(String[] args) {
                 Son son = new Son();
                 Mother mother = new Mother();
                 son.sleep(mother,2);
             }

        }





