package Game;

/**
 * 此为创建英雄类
 * 包含英雄的基本属性：名称、HP、MP、Exp、坐标x、y
 *
 */
public class CreatHero {

    String name;
    int HP,MP,Exp,x,y;



    CreatHero(String n){
        name=n;
        HP=500;
        MP=200;
        Exp=0;
    }

    /**
     *
     * 此函数用于初始化英雄的坐标参数
     *
     * @param x1
     * @param y1
     */
    public void Setxy(int x1,int y1)
    {
            x=x1;
            y=y1;
    }

    /**
     * 此函数用于修改英雄坐标
     *
     * @param x1
     * @param y1
     * @param change
     * @param flag
     */

    public void Changexy(int x1,int y1,int change,int flag)
    {
        if(flag==1)
        {
            x=x1;
            y=y1-change;

        }
        if(flag==2)
        {
            x=x1;
            y=y1+change;
        }
    }

    /**
     * 此函数用于输出英雄的属性信息
     */
    public void show()
    {
        System.out.printf("Name:%s-HP:%d-MP:%d-Exp:%d",name,HP,MP,Exp);
        System.out.println();
        System.out.printf("坐标x：%d, 坐标y：%d",x,y);
        System.out.println();
    }

}
