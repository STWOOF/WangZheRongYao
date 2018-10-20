package Game;

import java.util.*;

public class Main{

public static void main(String[]args)
{

        System.out.println("请输入你要召唤的英雄：");
        BattleDraw a=new BattleDraw();
        int flag=1;
        Scanner sc= new Scanner(System.in);

        ArrayList<CreatHero>List=new ArrayList<CreatHero>();

        for(int i=0;i<10;i++) {
                String name=sc.next();
                CreatHero hero = new CreatHero(name);
                List.add(hero);
        }

        int k=0;
        for(int i=5;i<10;i++)
        {
                int j=19;
                a.SetPosition(j,i,List.get(k).name);
                List.get(k).Setxy(i,j);
                k++;
        }
        k=5;
        for(int i=5;i<10;i++)
        {
                int j=0;

                a.SetPosition(j,i,List.get(k).name);

                List.get(k).Setxy(i,j);
                k++;
        }
        a.BattleShow();
        RoundControl r = new RoundControl();
        while(flag!=0) {
                int lowrax,highrax;
                r.CountRound(flag);
                if(flag==1)
                {
                        lowrax=0;
                        highrax=5;
                }
                else
                {
                        lowrax=5;
                        highrax=10;
                }
                int finalchange=0;
                System.out.println("请输入操作：1.移动 2.发呆 3.查看属性");
                int caozuo;
                caozuo=sc.nextInt();
                if(caozuo==1) {
                        System.out.println("请选择移动的英雄：");
                        for (int i = lowrax; i < highrax; i++)
                                System.out.printf("%d.%s ", i + 1, List.get(i).name);
                        System.out.println();

                        int mark = sc.nextInt();
                        int isok = 0;
                        mark--;
                        System.out.println("请输入前进的格数：");

                                while (isok == 0) {
                                        int change = sc.nextInt();
                                        isok = a.ChangePosition(List.get(mark).x, List.get(mark).y, change, List.get(mark).name,flag);
                                        finalchange=change;
                                }
                                a.BattleShow();
                                List.get(mark).Changexy(List.get(mark).x,List.get(mark).y,finalchange,flag);
                }
                else if(caozuo==2)
                {
                        System.out.println("请选择发呆的英雄：");
                        for(int i=lowrax;i<highrax;i++)
                                System.out.printf("%d.%s ",i+1,List.get(i).name);
                        System.out.println();
                        int mark = sc.nextInt();
                        System.out.println("发呆成功！");
                }

                else if(caozuo==3)
                {
                        System.out.println("请选择查看的英雄：");
                        for(int i=lowrax;i<highrax;i++)
                                System.out.printf("%d.%s ",i+1,List.get(i).name);
                        System.out.println();
                        int mark = sc.nextInt();
                        List.get(mark-1).show();
                }

                System.out.println("继续操作吗？ 1.yes 2.no");
                int newround=sc.nextInt();
                if(newround==2&&flag==1)
                {
                        flag=2;
                }
                else if(newround==2&&flag==2)
                {
                        flag=1;
                }
        }
}


}