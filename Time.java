public class Time {
    public static void main(String[] args) {
        HrsException h = new HrsException("Hrs Exception!!!");
        MinException m = new MinException("Min Exception!!!");
        SecException s = new SecException("Sec Exception!!!");
        try {
            int hr=10;
            int min=20;
            int sec=75;
            h.throwHrsException(hr);
            m.throwsMinException(min);
            s.throwSecException(sec);
        }
        catch (HrsException e){
            System.out.println(e);
        }
        catch (MinException e){
            System.out.println(e);
        }
        catch (SecException e){
            System.out.println(e);
        }
    }
}
