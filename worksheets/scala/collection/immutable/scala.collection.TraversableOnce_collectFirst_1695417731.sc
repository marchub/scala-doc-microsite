//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#collectFirst[B](pf:PartialFunction[A,B]):Option[B]">scala.collection.TraversableOnce#collectFirst</a></li>
//<li name="scala.collection.TraversableOnce#collectFirst" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="collectFirst[B](pf:PartialFunction[A,B]):Option[B]"></a><a id="collectFirst[B](PartialFunction[A,B]):Option[B]"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#collectFirst[B](pf:PartialFunction[A,B]):Option[B]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">collectFirst</span><span class="tparams">[<span name="B">B</span>]</span><span class="params">(<span name="pf">pf: <a href="../../PartialFunction.html" class="extype" name="scala.PartialFunction">PartialFunction</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>, <span class="extype" name="scala.collection.TraversableOnce.collectFirst.B">B</span>]</span>)</span><span class="result">: <a href="../../Option.html" class="extype" name="scala.Option">Option</a>[<span class="extype" name="scala.collection.TraversableOnce.collectFirst.B">B</span>]</span> </span> <p class="shortcomment cmt">Finds the first element of the traversable or iterator for which the given partial function is defined, and applies the partial function to it.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Finds the first element of the traversable or iterator for which the given partial function is defined, and applies the partial function to it.</p>
//   <p> Note: may not terminate for infinite-sized collections.</p>
//   <p> Note: might return different results for different runs, unless the underlying collection type is ordered. </p>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="param">
//    pf
//   </dt>
//   <dd class="cmt">
//    <p>the partial function</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>an option value containing pf applied to the first value for which it is defined, or <code>None</code> if none exists.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../TraversableOnce.html" class="extype" name="scala.collection.TraversableOnce">TraversableOnce</a>
//   </dd>
//   <div class="block">
//    Example: 
//    <ol>
//     <li class="cmt"><p><code>Seq("a", 1, 5L).collectFirst({ case x: Int =&gt; x*10 }) = Some(10)</code></p></li>
//    </ol> 
//   </div>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---
