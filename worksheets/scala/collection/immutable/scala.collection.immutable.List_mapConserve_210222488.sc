//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#mapConserve(f:A=>A):List[A]">scala.collection.immutable.List#mapConserve</a></li>
//<li name="scala.collection.immutable.List#mapConserve" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="mapConserve(f:A=>A):List[A]"></a><a id="mapConserve((A)⇒A):List[A]"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#mapConserve(f:A=>A):List[A]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier">final </span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">mapConserve</span><span class="params">(<span name="f">f: (<span class="extype" name="scala.collection.immutable.List.A">A</span>) ⇒ <span class="extype" name="scala.collection.immutable.List.A">A</span></span>)</span><span class="result">: <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>]</span> </span> <p class="shortcomment cmt">[use case] Builds a new list by applying a function to all elements of this list.</p>
// <div class="fullcomment">
//  [use case] 
//  <div class="comment cmt">
//   <p> Builds a new list by applying a function to all elements of this list. Like <code>xs map f</code>, but returns <code>xs</code> unchanged if function <code>f</code> maps all elements to themselves (as determined by <code>eq</code>).</p>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="param">
//    f
//   </dt>
//   <dd class="cmt">
//    <p>the function to apply to each element.</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>a list resulting from applying the given function <code>f</code> to each element of this list and collecting the results.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <div class="full-signature-block toggleContainer"> 
//    <span class="toggle"> <i class="material-icons"></i> Full Signature </span> 
//    <div class="hiddenContent full-signature-usecase">
//     <h4 id="signature" class="signature"> <span class="modifier_kind"> <span class="modifier">final </span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">mapConserve</span><span class="tparams">[<span name="B">B &gt;: <span class="extype" name="scala.collection.immutable.List.A">A</span> &lt;: <a href="../../AnyRef.html" class="extype" name="scala.AnyRef">AnyRef</a></span>]</span><span class="params">(<span name="f">f: (<span class="extype" name="scala.collection.immutable.List.A">A</span>) ⇒ <span class="extype" name="scala.collection.immutable.List.mapConserve.B">B</span></span>)</span><span class="result">: <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.mapConserve.B">B</span>]</span> </span> </h4>
//    </div> 
//   </div>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---


























