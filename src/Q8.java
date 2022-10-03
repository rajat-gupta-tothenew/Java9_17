 class TryAutoClosable implements AutoCloseable {
        @Override
        public void close(){
            System.out.println("AutoCloseAble Working");
        }
    }
    public class Q8 {
        public static void main(String[] args) {
            TryAutoClosable obj = new TryAutoClosable();
            try(obj){
                System.out.println("Trying Closeable");
            }
        }

    }

