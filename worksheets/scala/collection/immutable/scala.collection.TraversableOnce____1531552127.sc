//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#:\[B](z:B)(op:(A,B)=>B):B">scala.collection.TraversableOnce#:\</a></li>
//<li name="scala.collection.TraversableOnce#:\" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id=":\[B](z:B)(op:(A,B)=>B):B"></a><a id=":\[B](B)((A,B)⇒B):B"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#:\[B](z:B)(op:(A,B)=>B):B" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span title="gt4s: $colon$bslash" class="name">:\</span><span class="tparams">[<span name="B">B</span>]</span><span class="params">(<span name="z">z: <span class="extype" name="scala.collection.TraversableOnce.:\.B">B</span></span>)</span><span class="params">(<span name="op">op: (<span class="extype" name="scala.collection.immutable.List.A">A</span>, <span class="extype" name="scala.collection.TraversableOnce.:\.B">B</span>) ⇒ <span class="extype" name="scala.collection.TraversableOnce.:\.B">B</span></span>)</span><span class="result">: <span class="extype" name="scala.collection.TraversableOnce.:\.B">B</span></span> </span> <p class="shortcomment cmt">Applies a binary operator to all elements of this traversable or iterator and a start value, going right to left.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Applies a binary operator to all elements of this traversable or iterator and a start value, going right to left.</p>
//   <p> Note: <code>:\</code> is alternate syntax for <code>foldRight</code>; <code>xs :\ z</code> is the same as <code>xs foldRight z</code>.</p>
//   <p> Note: will not terminate for infinite-sized collections.</p>
//   <p> Note: might return different results for different runs, unless the underlying collection type is ordered or the operator is associative and commutative.</p>
//   <p> Examples:</p>
//   <p> Note that the folding function used to compute b is equivalent to that used to compute c.</p>
//   <pre>scala&gt; <span class="kw">val</span> a = <span class="std">List</span>(<span class="num">1</span>,<span class="num">2</span>,<span class="num">3</span>,<span class="num">4</span>)
//a: <span class="std">List</span>[<span class="std">Int</span>] = <span class="std">List</span>(<span class="num">1</span>, <span class="num">2</span>, <span class="num">3</span>, <span class="num">4</span>)
//
//scala&gt; <span class="kw">val</span> b = (a :\ <span class="num">5</span>)(_+_)
//b: <span class="std">Int</span> = <span class="num">15</span>
//
//scala&gt; <span class="kw">val</span> c = (a :\ <span class="num">5</span>)((x,y) <span class="kw">=&gt;</span> x + y)
//c: <span class="std">Int</span> = <span class="num">15</span></pre>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="tparam">
//    B
//   </dt>
//   <dd class="cmt">
//    <p>the result type of the binary operator.</p>
//   </dd>
//   <dt class="param">
//    z
//   </dt>
//   <dd class="cmt">
//    <p>the start value</p>
//   </dd>
//   <dt class="param">
//    op
//   </dt>
//   <dd class="cmt">
//    <p>the binary operator</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>the result of inserting <code>op</code> between consecutive elements of this traversable or iterator, going right to left with the start value <code>z</code> on the right:</p>
//    <pre>op(x_1, op(x_2, ... op(x_n, z)...))</pre>
//    <p> where <code>x<sub>1</sub>, ..., x<sub>n</sub></code> are the elements of this traversable or iterator.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../TraversableOnce.html" class="extype" name="scala.collection.TraversableOnce">TraversableOnce</a> → 
//    <a href="../GenTraversableOnce.html" class="extype" name="scala.collection.GenTraversableOnce">GenTraversableOnce</a>
//   </dd>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---
