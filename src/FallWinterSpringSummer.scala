import ChecksumAccumulator.calculate
/**
 * Created by nakul on 10/19/2015.
 */
object FallWinterSpringSummer extends App {
  for (season <- List("fall", "winter", "spring"))
    println(season +": "+ calculate(season))

}
