import java.math.BigInteger
import java.util.*

/**
 *    Created By XuanRan on 2022/1/12
 */
fun main() {
    var sc = Scanner(System.`in`)
    var n: BigInteger = sc.nextBigInteger()
    var a = n.multiply(n.subtract(BigInteger.valueOf(1))).divide(BigInteger.valueOf(2))
        .multiply(n.subtract(BigInteger.valueOf(2))).divide(
        BigInteger.valueOf(3)
    ).multiply(n.subtract(BigInteger.valueOf(3))).divide(BigInteger.valueOf(4))

    println(a)
}