//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#flatten[B]:List[B]">scala.collection.generic.GenericTraversableTemplate#flatten</a></li>
//<li name="scala.collection.generic.GenericTraversableTemplate#flatten" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="flatten[B]:List[B]"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#flatten[B]:List[B]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">flatten</span><span class="tparams">[<span name="B">B</span>]</span><span class="result">: <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.generic.GenericTraversableTemplate.flatten.B">B</span>]</span> </span> <p class="shortcomment cmt">[use case] Converts this list of traversable collections into a list formed by the elements of these traversable collections.</p>
// <div class="fullcomment">
//  [use case] 
//  <div class="comment cmt">
//   <p> Converts this list of traversable collections into a list formed by the elements of these traversable collections.</p>
//   <p> The resulting collection's type will be guided by the static type of list. For example:</p>
//   <pre><span class="kw">val</span> xs = <span class="std">List</span>(
//           <span class="std">Set</span>(<span class="num">1</span>, <span class="num">2</span>, <span class="num">3</span>),
//           <span class="std">Set</span>(<span class="num">1</span>, <span class="num">2</span>, <span class="num">3</span>)
//         ).flatten
//<span class="cmt">// xs == List(1, 2, 3, 1, 2, 3)</span>
//
//<span class="kw">val</span> ys = <span class="std">Set</span>(
//           <span class="std">List</span>(<span class="num">1</span>, <span class="num">2</span>, <span class="num">3</span>),
//           <span class="std">List</span>(<span class="num">3</span>, <span class="num">2</span>, <span class="num">1</span>)
//         ).flatten
//<span class="cmt">// ys == Set(1, 2, 3)</span></pre>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="tparam">
//    B
//   </dt>
//   <dd class="cmt">
//    <p>the type of the elements of each traversable collection.</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>a new list resulting from concatenating all element lists.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../generic/GenericTraversableTemplate.html" class="extype" name="scala.collection.generic.GenericTraversableTemplate">GenericTraversableTemplate</a>
//   </dd>
//   <div class="full-signature-block toggleContainer"> 
//    <span class="toggle"> <i class="material-icons"></i> Full Signature </span> 
//    <div class="hiddenContent full-signature-usecase">
//     <h4 id="signature" class="signature"> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">flatten</span><span class="tparams">[<span name="B">B</span>]</span><span class="params">(<span class="implicit">implicit </span><span name="asTraversable">asTraversable: (<span class="extype" name="scala.collection.immutable.List.A">A</span>) ⇒ <a href="../GenTraversableOnce.html" class="extype" name="scala.collection.GenTraversableOnce">GenTraversableOnce</a>[<span class="extype" name="scala.collection.generic.GenericTraversableTemplate.flatten.B">B</span>]</span>)</span><span class="result">: <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.generic.GenericTraversableTemplate.flatten.B">B</span>]</span> </span> </h4>
//    </div> 
//   </div>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---


























