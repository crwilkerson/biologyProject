public class BioFacts {
    String fact_num1 = "CNSS defines information security as 'the protection of information and its critical elements, including the systems and hardware that use, store, and transmit the information.'";
    String fact_num2 = "The components that make up information security are Software, Hardware, Data, People, Procedures, and Networks!";
    String fact_num3 = "A healthy security system involves Integrity, Confidentiality, and Availability.";
    String fact_num4 = "What's the difference between an Autotroph and a Heterotroph? Autotrophs make their own food via Photosynthesis, and Heterotrophs rely on other organisms.";
    String fact_num5 = "Did you know leaf color comes from pigments and depends on Chlorophyll? The vibrant green Chlorophyll dies in the fall and reveals the true leaf color underneath :) !";
    String fact_num6 = "Did you know that *Mitosis is cell duplication, and *Meiosis is the production of gametes for sexual reproduction?";
    
    public BioFacts(){
        
    }
    
    public BioFacts(String fact_num1, String fact_num2, String fact_num3, String fact_num4, String fact_num5, String fact_num6){
        this.fact_num1 = fact_num1;
        this.fact_num2 = fact_num2;
        this.fact_num3 = fact_num3;
        this.fact_num4 = fact_num4;
        this.fact_num5 = fact_num5;
        this.fact_num6 = fact_num6;
    }
    
    public String getFact1(){
        return fact_num1;
    }
    
    public String getFact2(){
        return fact_num2;
    }
    
    public String getFact3(){
        return fact_num3;
    }
    
    public String getFact4(){
        return fact_num4;
    }
    
    public String getFact5(){
        return fact_num5;
    }
    
    public String getFact6(){
        return fact_num6;
    }
}


//String fact_num2 = "Did you know that Apoptosis is known as cell death? A signal is sent for the cell to self destruct, and this is known as Apoptosis!";
//    String fact_num3 = "Did you know that Photosynhesis has the *reverse* equation as Cellular Respiration?";
//    String fact_num4 = "What's the difference between an Autotroph and a Heterotroph? Autotrophs make their own food via Photosynthesis, and Heterotrophs rely on other organisms.";
//    String fact_num5 = "Did you know leaf color comes from pigments and depends on Chlorophyll? The vibrant green Chlorophyll dies in the fall and reveals the true leaf color underneath :) !";
//    String fact_num6 = "Did you know that *Mitosis is cell duplication, and *Meiosis is the production of gametes for sexual reproduction?";