//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#sortBy[B](f:A=>B)(implicitord:scala.math.Ordering[B]):Repr">scala.collection.SeqLike#sortBy</a></li>
//<li name="scala.collection.SeqLike#sortBy" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="sortBy[B](f:A=>B)(implicitord:scala.math.Ordering[B]):Repr"></a><a id="sortBy[B]((A)⇒B)(math.Ordering[B]):List[A]"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#sortBy[B](f:A=>B)(implicitord:scala.math.Ordering[B]):Repr" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">sortBy</span><span class="tparams">[<span name="B">B</span>]</span><span class="params">(<span name="f">f: (<span class="extype" name="scala.collection.immutable.List.A">A</span>) ⇒ <span class="extype" name="scala.collection.SeqLike.sortBy.B">B</span></span>)</span><span class="params">(<span class="implicit">implicit </span><span name="ord">ord: <a href="../../math/Ordering.html" class="extype" name="scala.math.Ordering">math.Ordering</a>[<span class="extype" name="scala.collection.SeqLike.sortBy.B">B</span>]</span>)</span><span class="result">: <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>]</span> </span> <p class="shortcomment cmt">Sorts this <code>Seq</code> according to the Ordering which results from transforming an implicitly given Ordering with a transformation function.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Sorts this <code>Seq</code> according to the Ordering which results from transforming an implicitly given Ordering with a transformation function.</p>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="tparam">
//    B
//   </dt>
//   <dd class="cmt">
//    <p>the target type of the transformation <code>f</code>, and the type where the ordering <code>ord</code> is defined.</p>
//   </dd>
//   <dt class="param">
//    f
//   </dt>
//   <dd class="cmt">
//    <p>the transformation function mapping elements to some other domain <code>B</code>.</p>
//   </dd>
//   <dt class="param">
//    ord
//   </dt>
//   <dd class="cmt">
//    <p>the ordering assumed on domain <code>B</code>.</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>a sequence consisting of the elements of this sequence sorted according to the ordering where <code>x &lt; y</code> if <code>ord.lt(f(x), f(y))</code>.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../SeqLike.html" class="extype" name="scala.collection.SeqLike">SeqLike</a>
//   </dd>
//   <div class="block">
//    Example: 
//    <ol>
//     <li class="cmt"><p></p><pre><span class="kw">val</span> words = <span class="lit">"The quick brown fox jumped over the lazy dog"</span>.split(<span class="lit">' '</span>)
//<span class="cmt">// this works because scala.Ordering will implicitly provide an Ordering[Tuple2[Int, Char]]</span>
//words.sortBy(x <span class="kw">=&gt;</span> (x.length, x.head))
//res0: <span class="std">Array</span>[<span class="std">String</span>] = <span class="std">Array</span>(The, dog, fox, the, <span class="kw">lazy</span>, over, brown, quick, jumped)</pre></li>
//    </ol> 
//   </div>
//   <dt>
//    See also
//   </dt>
//   <dd>
//    <span class="cmt"><p><a href="../../math/Ordering.html" class="extype" name="scala.math.Ordering">scala.math.Ordering</a> Note: will not terminate for infinite-sized collections.</p></span>
//   </dd>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---

//```tut
List(
  (4,"a"),
  (1,"b"),
  (3,"c"),
  (2,"d")
).sortBy(_._1)
//```

//```tut
List(
  (4,"a"),
  (1,"b"),
  (3,"c"),
  (2,"d")
).sortBy(_._2)
//```

//```tut:silent
case class Point(x: Int, y: Int)

val points = List(
  Point(4,1),
  Point(1,4),
  Point(3,2),
  Point(2,3)
)
//```

//```tut
points.sortBy(_.x)
//```

//```tut
points.sortBy(_.y)
//```
























