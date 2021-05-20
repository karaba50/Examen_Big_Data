object ExamenBigData {


  def main(args: Array[String]): Unit ={
    println("bonjour")
    val maliste=List("JVC","JJJ","ecolen","paysn")
    println(liste_Function(maliste))
  }
  def liste_Function(liste_envoyer:List[String]):List[String]={
    val liste_retouner= liste_envoyer.filter(i=>i.endsWith("n"))
    return liste_retouner
  }
}
