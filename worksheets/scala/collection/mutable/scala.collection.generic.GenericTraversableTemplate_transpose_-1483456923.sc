//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#transpose[B](implicitasTraversable:A=>scala.collection.GenTraversableOnce[B]):CC[CC[B]@scala.annotation.unchecked.uncheckedVariance]">scala.collection.generic.GenericTraversableTemplate#transpose</a></li>
//<li name="scala.collection.generic.GenericTraversableTemplate#transpose" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="transpose[B](implicitasTraversable:A=>scala.collection.GenTraversableOnce[B]):CC[CC[B]@scala.annotation.unchecked.uncheckedVariance]"></a><a id="transpose[B]((A)⇒GenTraversableOnce[B]):ArrayBuffer[ArrayBuffer[B]]"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#transpose[B](implicitasTraversable:A=>scala.collection.GenTraversableOnce[B]):CC[CC[B]@scala.annotation.unchecked.uncheckedVariance]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">transpose</span><span class="tparams">[<span name="B">B</span>]</span><span class="params">(<span class="implicit">implicit </span><span name="asTraversable">asTraversable: (<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>) ⇒ <a href="../GenTraversableOnce.html" class="extype" name="scala.collection.GenTraversableOnce">GenTraversableOnce</a>[<span class="extype" name="scala.collection.generic.GenericTraversableTemplate.transpose.B">B</span>]</span>)</span><span class="result">: <a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.generic.GenericTraversableTemplate.transpose.B">B</span>]]</span> </span> <p class="shortcomment cmt">Transposes this collection of traversable collections into a collection of collections.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Transposes this collection of traversable collections into a collection of collections.</p>
//   <p> The resulting collection's type will be guided by the static type of collection. For example:</p>
//   <pre><span class="kw">val</span> xs = <span class="std">List</span>(
//           <span class="std">Set</span>(<span class="num">1</span>, <span class="num">2</span>, <span class="num">3</span>),
//           <span class="std">Set</span>(<span class="num">4</span>, <span class="num">5</span>, <span class="num">6</span>)).transpose
//<span class="cmt">// xs == List(</span>
//<span class="cmt">//         List(1, 4),</span>
//<span class="cmt">//         List(2, 5),</span>
//<span class="cmt">//         List(3, 6))</span>
//
//<span class="kw">val</span> ys = Vector(
//           <span class="std">List</span>(<span class="num">1</span>, <span class="num">2</span>, <span class="num">3</span>),
//           <span class="std">List</span>(<span class="num">4</span>, <span class="num">5</span>, <span class="num">6</span>)).transpose
//<span class="cmt">// ys == Vector(</span>
//<span class="cmt">//         Vector(1, 4),</span>
//<span class="cmt">//         Vector(2, 5),</span>
//<span class="cmt">//         Vector(3, 6))</span></pre>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="tparam">
//    B
//   </dt>
//   <dd class="cmt">
//    <p>the type of the elements of each traversable collection.</p>
//   </dd>
//   <dt class="param">
//    asTraversable
//   </dt>
//   <dd class="cmt">
//    <p>an implicit conversion which asserts that the element type of this collection is a <code>Traversable</code>.</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>a two-dimensional collection of collections which has as <i>n</i>th row the <i>n</i>th column of this collection.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../generic/GenericTraversableTemplate.html" class="extype" name="scala.collection.generic.GenericTraversableTemplate">GenericTraversableTemplate</a>
//   </dd>
//   <dt>
//    Annotations
//   </dt>
//   <dd> 
//    <span class="name">@migration</span> 
//   </dd>
//   <dt>
//    Migration
//   </dt>
//   <dd class="cmt">
//    <p><i>(Changed in version 2.9.0)</i> <code>transpose</code> throws an <code>IllegalArgumentException</code> if collections are not uniformly sized.</p>
//   </dd>
//   <dt>
//    Exceptions thrown
//   </dt>
//   <dd>
//    <span class="cmt"><p><a href="../../index.html#IllegalArgumentException=IllegalArgumentException" class="extmbr" name="scala.IllegalArgumentException"><code>IllegalArgumentException</code></a> if all collections in this collection are not of the same size.</p></span>
//   </dd>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---












