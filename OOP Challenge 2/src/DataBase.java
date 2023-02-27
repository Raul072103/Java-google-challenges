import org.jetbrains.annotations.NotNull;

public class DataBase {

    public static Studio[] getData(){
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 02", 20, new Premiu[]{});

        Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(2018, "film cu actori de oscar", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
        Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};

        return studioDatabase;
    }

        public static void printStudiosWithMoreThan2Movies(){
            System.out.println("The names of the studios that have more than 2 movies published: ");
            for(Studio studioDatabase : getData())
                if(studioDatabase.getNumberOfFilms() > 2)
                    System.out.println(studioDatabase.getNume());

        }

        public static void printTheStudiosAtWhichTheActorHas2Oscars(){
            System.out.println("The names of the studios that \"Actor cu 2 oscaruri\" has played are:");
            for(Studio studioDatabase : getData()){
                Film[] filme = studioDatabase.getFilm();
                    for(Film film : filme)
                        for(Actor actor : film.getActori())
                        if((actor.getNume()).equals("actor cu 2 oscaruri") == true)
                System.out.println(studioDatabase.getNume());

            }
        }

        public static void printMovieNamesWithActorsOlderThan50(){
            System.out.println("The movie names in which actors with the age above 50 play:");
                for(Studio studioDatabase : getData()){
                    Film[] filme = studioDatabase.getFilm();
                        for(Film film : filme){
                            int ok = 0;
                            Actor[] actori = film.getActori();
                                for(Actor actor : actori)
                                    if(actor.getVarsta() > 50)
                                        ok++;
                             if(ok > 0)
                                 System.out.println(film.getNume());
                        }
                }
        }

    public static void main(String[] args) {
        printMovieNamesWithActorsOlderThan50();
        printStudiosWithMoreThan2Movies();
        printTheStudiosAtWhichTheActorHas2Oscars();

    }
}
