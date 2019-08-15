package googleCharts;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GerarHTML {
	
	public static void gerarHtml(String[][] vetor) throws IOException {
		
		String html2 = "<html>\n" +
                                "  <head>\n" +
                                "    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n" +
                                "    <script type=\"text/javascript\">\n" +
                                "      google.charts.load('current', {'packages':['corechart']});\n" +
                                "      google.charts.setOnLoadCallback(drawChart);\n" +
                                "\n" +
                                "      function drawChart() {\n" +
                                "\n" +
                                "        var data = google.visualization.arrayToDataTable([\n" +
                                "          ['Tarefas', 'Horas por dia'],\n"+ retornaDados2(vetor) + "      ]" +
                                "         );\n" +
                                "\n" +
                                "        var options = {\n" +
                                "          title: 'Atividades Diárias',"+
                                "          pieHole: 0.5,\n" +
                                "          pieSliceTextStyle: {\n" +
                                "            color: 'black',\n" +
                                "          },\n" +
                                "          legend: 'Atividades Diarias'\n" +
                                "        };\n" +
                                "\n" +
                                "        var chart = new google.visualization.PieChart(document.getElementById('donut_single'));\n" +
                                "        chart.draw(data, options);\n" +
                                "      }\n" +
                                "    </script>\n" +
                                "  </head>\n" +
                                "  <body>\n" +
                                "    <div id=\"donut_single\" style=\"width: 900px; height: 500px;\"></div>\n" +
                                "  </body>\n" +
                                "</html>;";
		
                String dir = System.getProperty("user.dir");
                FileWriter arq = new FileWriter(System.getProperty("user.dir")+"\\src\\GoogleCharts\\grafico.html");
                PrintWriter gravarArq = new PrintWriter(arq);
	 
                gravarArq.printf(html2);
                arq.close();
	}
	
	
	private static String retornaDados2(String[][] vetor) {
		String dados = "";
                for (int i=0; i<vetor.length; i++) {                    
                    for (int j=0; j<2; j++) {
                        dados += "['" + vetor[i][j] + "', " + vetor[i][j+1] +"],\r\n";
                        j++;
                    }
                }
		return dados;
	}
}
