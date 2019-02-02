// =========================== SQL

/*

CREATE TABLE IF NOT EXISTS `Employee` (
  `name` varchar(50) NOT NULL,
  `salary` int(10) NOT NULL,
  `dept` varchar(200) NOT NULL
) DEFAULT CHARSET=utf8;
INSERT INTO `Employee` (`name`, `salary`, `dept`) VALUES
  ('marc', '10', 'dept1'),
  ('joe', '20', 'dept1'),
  ('sally', '10', 'dept221'),
  ('kev', '30', 'dept13');


SELECT *,
    RANK() OVER (PARTITION BY salary ORDER BY salary DESC) AS SalaryRank
  FROM Employee;


*/

// =========================== EXERCISE 1 - DUPLICATES

val examples = List(
  List(),
  List(1),
  List(1, 1),
  List(1, 2),
  List(1, 1, 1),
  List(1, 2, 2),
  List(1, 2, 3, 4, 1),
  List(1, 2, 3, 4, 4),
  List(1, 2, 3, 3, 4),
  List(1, 2, 3, 4, 4, 4),
  List(1, 2, 3, 4, 4, 4, 4),
  List(1, 1, 1, 2, 3, 4, 6, 6)
)

def printResults(f: List[Int] => Int) = examples.foreach(ex => println(s"List(${ex.mkString(",")}) => ${f(ex)}"))

def mysum1(xs: List[Int]): Int = xs.groupBy(identity)
  .collect{case (k,v) if v.size==1 => k}
  .sum

printResults(mysum1)

def mysum2(xs: List[Int]): Int = {
  val xsDistinct = xs.distinct
  val dups = xs diff xsDistinct
  xsDistinct.filterNot(dups.contains)
}.sum

printResults(mysum2)

def mysum3(xs: List[Int]) = {
  val xss = xs.sorted
  xss.zipWithIndex.collect{ case (x,i) if !(
      (i!=0         && xss(i-1) == x) || // true if index before is the same value
      (i<xss.size-1 && xss(i+1) == x)    // true if index after is the same value
    ) => x}
}.sum

printResults(mysum3)


// =========================== EXERCISE 2 - TREE

import scala.collection.mutable.ArrayBuffer

def tree1(s: Int) = {
  require(s > 0)

  val buf = ArrayBuffer.fill(s)('.')
  val endInd = s - 1
  buf(endInd) = '*'
  for (level <- 1 to s) {
    println(buf.mkString("`", "", "`"))
    val updateInd = endInd - level
    if (updateInd >= 0) buf(updateInd) = '*'
  }
}

tree1(6)

def tree2(s: Int) = {
  require(s > 0)

  for (level <- 0 until s) {
    print('`')
    for (_ <- 0 to s - level - 2) print('.')
    for (_ <- 1 to level + 1)     print('*')
    println('`')
  }
}

tree2(6)
