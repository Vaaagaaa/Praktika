import java.io.IOException;

class Zachetka{

    private Info[]  information;

    class Info{
        private int numberSession;
        private int numberZachet;
        private int numberExam;

        Info(int numberSession, int numberZachet, int numberExam){
            this.numberSession = numberSession;
            this.numberZachet = numberZachet;
            this.numberExam = numberExam;
        }

        public int getNumberSession() {
            return numberSession;
        }

        public void setNumberSession(int numberSession) {
            this.numberSession = numberSession;
        }

        public int getNumberZachet() {
            return numberZachet;
        }

        public void setNumberZachet(int numberZachet) {
            this.numberZachet = numberZachet;
        }

        public int getNumberExam() {
            return numberExam;
        }

        public void setNumberExam(int numberExam) {
            this.numberExam = numberExam;
        }
    }

    public void addToInfo(int[] numberExam, int[] numberZachet, int[] numberSession){
        information = new Info[numberExam.length];
        for (int i = 0; i < numberExam.length; i++) {
            information[i] = new Info(numberSession[i],numberZachet[i],numberExam[i]);
        }
    }

    @Override
    public String toString() {
        String info = "";
        for (int i = 0; i < information.length; i++) {
            info+="Сессия №" + information[i].getNumberSession() + ", количество зачётов = "  + information[i].getNumberZachet()
                    + ", количество экзаменов = " + information[i].getNumberExam() + "\n";
        }
        return info;
    }
}
public class ZachetnayaKnijka {
    public static void main(String[] args) throws IOException {
//        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        Zachetka session = new Zachetka();
        int[] numberExam = {5, 3, 2};
        int[] numberZachet = {7, 6, 8};
        int[] numberSession = {1, 2, 3};
        session.addToInfo(numberExam, numberZachet, numberSession);
        System.out.print(session.toString());
    }
}