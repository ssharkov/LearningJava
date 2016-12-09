package Learning.Classes.Box;

/**
 * Created by ssharkov on 01.12.2016.
 */
public class Box {
    int width;
    int height;
    int depth;

    Box( int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }
    Box (){
        width =-1;
        height = -1;
        depth = -1;
    }
    Box(int len){
        width = height = depth = len;
    }

    int volume() {
        return width * height * depth;
}

    void setDim(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }


}
