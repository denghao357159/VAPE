package com.Eastiy.EXO.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.Arrays;
import android.graphics.drawable.GradientDrawable;
import java.util.ArrayList;
import android.graphics.Color;

public class ColorLibrary {
        /*
         LibraryName:AnswerLibrary 3.0 Bate 2
         LibraryVersionNumber:3.0 Bate 2
         LibraryType:StringColor BackgroundColor And RoundColor
         Dev:Eternal Answer
         Copyright:Online OS 2021
         **/

        public static String[] daycm=new String[]{"#ffffff","#f9f9f9","#f4f4f4","#e9e9e9","#000000","#9198e5","#000000"};

        public static String[] nitcm=new String[]{"#000000","#222222","#333333","#3f3f3f","#eeeeee","#e66465","#ffffff"};

        public static String[] clm=ColorLibrary.daycm;

        public static String[][] colors =new String[][]{
                    {" ", " &nbsp;"},
                    {"\n", "<br/>"},
                    {"§l", "</b><b>"},
                    {"§m", "</del><del>"},
                    {"§n", "</ins><ins>"},
                    {"§o", "</i><i>"},
                    {"§r", "</font></b></del></ins></i>"},
                    {"§0", "</font><font color=#000000>"},
                    {"§1", "</font><font color=#0000AA>"},
                    {"§2", "</font><font color=#72EEBC>"},
                    {"§3", "</font><font color=#00AAAA>"},
                    {"§4", "</font><font color=#FFA39E>"},
                    {"§5", "</font><font color=#FB98BF>"},
                    {"§6", "</font><font color=#B0E2FF>"},
                    {"§7", "</font><font color=#d3cad3>"},
                    {"§8", "</font><font color=#555555>"},
                    {"§9", "</font><font color=#5555FF>"},
                    {"§a", "</font><font color=#55FF55>"},
                    {"§b", "</font><font color=#70E3FF>"},
                    {"§c", "</font><font color=#FF5555>"},
                    {"§d", "</font><font color=#e9a2eb>"},
                    {"§e", "</font><font color=#ffcf75>"},
                    {"§f", "</font><font color=#FFFFFF>"}
            };

        public static android.text.Spanned FontColor(String text) {

                for (int e = 0; e < colors.length; e++) {
                        text = join(text.split(colors[e][0]), colors[e][1]);
                    }
                return android.text.Html.fromHtml(text);
            }

        public static String join(Iterator it, String str) {
                if (!it.hasNext()) {
                        return "";
                    }
                String start = it.next().toString();
                if (!it.hasNext()) {
                        return start;
                    }
                StringBuilder sb = new StringBuilder(64).append(start);
                while (it.hasNext()) {
                        sb.append(str);
                        sb.append(it.next());
                    }
                return sb.toString();
            }

        public static String join(Collection collection, String str) {
                return join(collection.iterator(), str);
            }

        public static String join(String[] strArr, String str) {
                return join(Arrays.asList(strArr), str);
            }

        public static GradientDrawable Portable(Object[] var0, Object var1) {
                String[] var2 = (String[])var0;
                ArrayList var3 = new ArrayList();

                int var4;
                for (var4 = 1; var4 < var2.length; ++var4) {
                        var3.add(new Integer(hexColor(var2[var4])));
                    }

                int[] var5 = new int[var3.size()];

                for (var4 = 0; var4 < var3.size(); ++var4) {
                        var5[var4] = ((Integer)var3.get(var4)).intValue();
                    }

                return new roundRect(var5, var1, var2[0]);
            }

        public static GradientDrawable Portable(Object[] hex, int round) {
                ArrayList<Object> hexed=new ArrayList<Object>();

                String[] hex2=(String[])(hex);
                int[] color;

                for (int a=1;a < hex2.length;a++) {    
                        hexed.add(hexColor(hex2[a].toString()));
                    }
                color = new int[hexed.size()];
                for (int b=0;b < hexed.size();b++) {    
                        color[b] = (int) hexed.get(b);
                    }

                return new roundRect(color, round, hex2[0]);
            }


        //正式版
        public static GradientDrawable roundBG(Object hex, Object round, String f, Object s) {
			if(s==null){
				s=0;
			}
                if (isArray(hex)) {
                        String[] hex2=(String[])hex;
                        return new roundRect(new int[]{Color.parseColor(hex2[0]),Color.parseColor(hex2[1])}, round, hex2[2], 0);
                    } else {
                        return new roundRect(Color.parseColor((String)(hex)), round, f, s);
                    }
            }

        public static GradientDrawable roundBG(Object hex, Object round, String f) {
                if (isArray(hex)) {
                        String[] hex2=(String[])hex;
                        return new roundRect(new int[]{Color.parseColor(hex2[0]),Color.parseColor(hex2[1])}, round, hex2[2], 0);
                    } else {
                        return new roundRect(Color.parseColor((String)(hex)), round, f, null);
                    }
            }

        public static GradientDrawable roundBG(Object hex, Object round) {
                if (isArray(hex)) {
                        String[] hex2=(String[])hex;
                        return new roundRect(new int[]{Color.parseColor(hex2[0]),Color.parseColor(hex2[1])}, round, hex2[2], 0);
                    } else {
                        return new roundRect(Color.parseColor((String)(hex)), round, null);
                    }
            }

        public static GradientDrawable roundBG(Object hex) {
                if (isArray(hex)) {
                        String[] hex2=(String[])hex;
                        return new roundRect(new int[]{Color.parseColor(hex2[0]),Color.parseColor(hex2[1])}, 0, hex2[2], 0);
                    } else {
                        return new roundRect(Color.parseColor((String)(hex)), 0);
                    }
            }

        public static int hexColor(String c) {
                return android.graphics.Color.parseColor(c);
            };

        public static boolean isArray(Object obj) {
                if (obj == null) {
                        return false;
                    }
                return obj.getClass().isArray();
            }


    }
