public class Person {

    private String name;
    private String job, university, drivingLicence;
    private boolean isMarried;

    private Person(Builder builder){
        this.name = builder.name;
        this.isMarried = builder.isMarried;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicence = builder.drivingLicence;
    }

    public String getName(){ return this.name; }

    public  String getJob(){ return this.job; }

    public String getUniversity(){ return this.university; }

    public String getDrivingLicence(){ return this.drivingLicence; }

    public Boolean getTheMariageStatus(){ return this.isMarried; }
    public static class Builder {

        private String name; //required parameters
        private String job, university, drivingLicence;  //optional parameters
        private boolean isMarried;      //optional parameters

        public Builder(String name){ this.name = name; }

        public Builder setIfMarried(boolean isMarried){
            this.isMarried = isMarried;
            return this;
        }

        public Builder setJob(String job){ this.job = job; return this; }

        public Builder setUniversity(String university){ this.university = university; return this; }

        public Builder setDrivingLicence(String drivingLicence){ this.drivingLicence = drivingLicence; return  this; }

        public Person build(){
            return new Person(this);
        }
    }
}
