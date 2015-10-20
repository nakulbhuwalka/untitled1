import ChecksumAccumulator.calculate

/**
 * Created by nakul on 10/19/2015.
 */

object Summer {
  def main(args: Array[String]) {
    for (arg <- args )
      println(arg +": "+ calculate(arg))
  }
}