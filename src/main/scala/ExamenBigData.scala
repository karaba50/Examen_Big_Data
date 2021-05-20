import java.util.regex.Pattern
object ExamenBigData {


  def main(args: Array[String]): Unit ={
    println("bonjour")
    val maliste=List("Julien","Paul","jean","rac","trec","joel","ed","chris")
    println(liste_Function(maliste))
    list_double()
  }
  def liste_Function(liste_envoyer:List[String]):List[String]={
    val liste_retouner= liste_envoyer.filter(i=>i.endsWith("n"))
    return liste_retouner
  }
  def list_double(): Unit ={
    val maliste=List(
      ("ecommercemag.fr",""),
      ("https://www.journalducm.com/contact/","payant"),
      ("https://www.zatsaz.com","payant"),
      ("https://www.lerevenu.com",""),
      ("https://www.cadre-diregeantfdeantèmagazine.com","payant"),
      ("https://www.silicon.fr/services/contact#annoncer","payant"),
      ("https://www.channelbiz.fr/nous-contactez/",""),
      ("https://www.itespresso.fr/",""),
      ("https://www.industrie-mag.com/article4.html","invité"),
      ("https://www.jesuisundev.com","invité"),
      ("https://www.numerama.com","")
    )


    val secondeTab  = maliste.map(l => {
      if (l._1.startsWith("https://www.")){ (l._1.substring(12),l._2) }
      else{ (l._1, l._2)}
    }).foreach(l =>println(l))

  }
}
