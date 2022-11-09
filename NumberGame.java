    class NumberGame {

        int num;
    
        public NumberGame(int n){
            num = n;
        }
    
        public void play() {
            while (num > 1) {
                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = num * 3 + 1;
                }
                System.out.print(num + ", ");
            }
            System.out.println("and done!");
        }
    
        public static void main(String[] args) {
            int n = 5;
            if (args.length > 0) {
                n = Integer.parseInt(args[0]);
            } 
            NumberGame myGame = new NumberGame(n);
            myGame.play();
        }
    
    }

