public class task {
    private  final int id;
    private String description;
    private boolean done;

    public task(int id, String description){
        this.id=id;
        this.description=description;
        this.done=false;
    }


    public int getId(){
        return this.id;
    }
    public String getDescription(){
        return  this.description;
    }

    public boolean isDone(){
        return done;
    }
    public void markDone(){
        this.done=true;
    }
    public void markUndone(){
        this.done=false;
    }

    public void setDescription(String description){
        this.description=description;
    }
    
}
