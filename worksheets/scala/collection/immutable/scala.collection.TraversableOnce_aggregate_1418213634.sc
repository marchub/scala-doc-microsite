//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#aggregate[B](z:=>B)(seqop:(B,A)=>B,combop:(B,B)=>B):B">scala.collection.TraversableOnce#aggregate</a></li>
//<li name="scala.collection.TraversableOnce#aggregate" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="aggregate[B](z:=>B)(seqop:(B,A)=>B,combop:(B,B)=>B):B"></a><a id="aggregate[B](⇒B)((B,A)⇒B,(B,B)⇒B):B"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#aggregate[B](z:=>B)(seqop:(B,A)=>B,combop:(B,B)=>B):B" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">aggregate</span><span class="tparams">[<span name="B">B</span>]</span><span class="params">(<span name="z">z: ⇒ <span class="extype" name="scala.collection.TraversableOnce.aggregate.B">B</span></span>)</span><span class="params">(<span name="seqop">seqop: (<span class="extype" name="scala.collection.TraversableOnce.aggregate.B">B</span>, <span class="extype" name="scala.collection.immutable.List.A">A</span>) ⇒ <span class="extype" name="scala.collection.TraversableOnce.aggregate.B">B</span></span>, <span name="combop">combop: (<span class="extype" name="scala.collection.TraversableOnce.aggregate.B">B</span>, <span class="extype" name="scala.collection.TraversableOnce.aggregate.B">B</span>) ⇒ <span class="extype" name="scala.collection.TraversableOnce.aggregate.B">B</span></span>)</span><span class="result">: <span class="extype" name="scala.collection.TraversableOnce.aggregate.B">B</span></span> </span> <p class="shortcomment cmt">Aggregates the results of applying an operator to subsequent elements.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Aggregates the results of applying an operator to subsequent elements.</p>
//   <p> This is a more general form of <code>fold</code> and <code>reduce</code>. It is similar to <code>foldLeft</code> in that it doesn't require the result to be a supertype of the element type. In addition, it allows parallel collections to be processed in chunks, and then combines the intermediate results.</p>
//   <p> <code>aggregate</code> splits the traversable or iterator into partitions and processes each partition by sequentially applying <code>seqop</code>, starting with <code>z</code> (like <code>foldLeft</code>). Those intermediate results are then combined by using <code>combop</code> (like <code>fold</code>). The implementation of this operation may operate on an arbitrary number of collection partitions (even 1), so <code>combop</code> may be invoked an arbitrary number of times (even 0).</p>
//   <p> As an example, consider summing up the integer values of a list of chars. The initial value for the sum is 0. First, <code>seqop</code> transforms each input character to an Int and adds it to the sum (of the partition). Then, <code>combop</code> just needs to sum up the intermediate results of the partitions:</p>
//   <pre><span class="std">List</span>(<span class="lit">'a'</span>, <span class="lit">'b'</span>, <span class="lit">'c'</span>).aggregate(<span class="num">0</span>)({ (sum, ch) <span class="kw">=&gt;</span> sum + ch.toInt }, { (p1, p2) <span class="kw">=&gt;</span> p1 + p2 })</pre>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="tparam">
//    B
//   </dt>
//   <dd class="cmt">
//    <p>the type of accumulated results</p>
//   </dd>
//   <dt class="param">
//    z
//   </dt>
//   <dd class="cmt">
//    <p>the initial value for the accumulated result of the partition - this will typically be the neutral element for the <code>seqop</code> operator (e.g. <code>Nil</code> for list concatenation or <code>0</code> for summation) and may be evaluated more than once</p>
//   </dd>
//   <dt class="param">
//    seqop
//   </dt>
//   <dd class="cmt">
//    <p>an operator used to accumulate results within a partition</p>
//   </dd>
//   <dt class="param">
//    combop
//   </dt>
//   <dd class="cmt">
//    <p>an associative operator used to combine results from different partitions</p>
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
