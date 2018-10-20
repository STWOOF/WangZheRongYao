package Game;

import java.util.*;

/**
 * 这是绘制输出战场类
 * 用于战场环境的输出
 * 由m*n的矩阵组成
 */

public class BattleDraw
{

    String [][] outline= new String[20][15];
    Scanner sc = new Scanner(System.in);

    BattleDraw() {
        for(int i=0;i<20;i++)
        for(int j=0;j<15;j++)
        {
            outline[i][j]="⭕";
        }

    }

    /**
     *
     * 该函数用于输出战场
     * 可在操作后实时输出战场变化情况
     *
     */

    public void BattleShow()
    {for(int i=0;i<20;i++)
    {
        for (int j = 0; j < 15; j++)
        {
            System.out.print(outline[i][j]);
        }
        System.out.println();

    }}

    /**
     *
     * 该函数用于设置英雄的位置
     * 放置英雄到指定位置
     *
     * @param xx
     * @param yy
     * @param name
     * @return
     */

    public int SetPosition(int xx,int yy,String name)
    {

        if(outline[xx][yy]=="⭕") {

            outline[xx][yy] = name;
            return 1;
        }
        else {
            System.out.println("位置已被占用！");
            return 0;
        }

    }

    /**
     * 此函数用于改变英雄位置
     * 将英雄前进到某个位置
     * 包含对该位置合法性的判断
     * 位置非法时输出"该位置已被占用"
     *
     * @param xx
     * @param yy
     * @param change
     * @param name
     * @param flag
     * @return
     */

    public int ChangePosition(int yy,int xx,int change,String name,int flag)
    {
        if(flag==1)
        {
            if(xx-change<0)
            {
                System.out.println("位置越界！");
                return 0;
            }
             else if(outline[xx-change][yy]=="⭕")
             {

                outline[xx - change][yy] = name;
                outline[xx][yy] = "⭕";
                return 1;
             }

        }

        else if(flag==2)
        {
            if(xx+change>19)
            {
                System.out.println("位置越界！");
                return 0;
            }
            else if(outline[xx+change][yy]=="⭕")
            {
                outline[xx+change][yy] = name;
                outline[xx][yy] = "⭕";
                return 1;
            }

        }
            System.out.println("位置已被占用！");
            return 0;

    }





};
