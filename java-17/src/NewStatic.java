public  class NewStatic {

    public static void main(String[] args) {

    Classes.cannotInitiliz();


    }



    public static class Classes{

        public static void cannotInitiliz(){
            System.out.println("Cannot create New Object");
        }

        private Classes(){

        }
    }
}
