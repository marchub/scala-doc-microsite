//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#zip[B](that:scala.collection.GenIterable[B]):List[(A,B)]">scala.collection.IterableLike#zip</a></li>
//<li name="scala.collection.IterableLike#zip" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="zip[B](that:scala.collection.GenIterable[B]):List[(A,B)]"></a><a id="zip[B](GenIterable[B]):List[(A,B)]"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#zip[B](that:scala.collection.GenIterable[B]):List[(A,B)]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">zip</span><span class="tparams">[<span name="B">B</span>]</span><span class="params">(<span name="that">that: <a href="../GenIterable.html" class="extype" name="scala.collection.GenIterable">GenIterable</a>[<span class="extype" name="scala.collection.IterableLike.zip.B">B</span>]</span>)</span><span class="result">: <a href="" class="extype" name="scala.collection.immutable.List">List</a>[(<span class="extype" name="scala.collection.GenIterableLike.A">A</span>, <span class="extype" name="scala.collection.IterableLike.zip.B">B</span>)]</span> </span> <p class="shortcomment cmt">[use case] Returns a list formed from this list and another iterable collection by combining corresponding elements in pairs.</p>
// <div class="fullcomment">
//  [use case] 
//  <div class="comment cmt">
//   <p> Returns a list formed from this list and another iterable collection by combining corresponding elements in pairs. If one of the two collections is longer than the other, its remaining elements are ignored.</p>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="tparam">
//    B
//   </dt>
//   <dd class="cmt">
//    <p>the type of the second half of the returned pairs</p>
//   </dd>
//   <dt class="param">
//    that
//   </dt>
//   <dd class="cmt">
//    <p>The iterable providing the second half of each result pair</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>a new list containing pairs consisting of corresponding elements of this list and <code>that</code>. The length of the returned collection is the minimum of the lengths of this list and <code>that</code>.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../IterableLike.html" class="extype" name="scala.collection.IterableLike">IterableLike</a> → 
//    <a href="../GenIterableLike.html" class="extype" name="scala.collection.GenIterableLike">GenIterableLike</a>
//   </dd>
//   <div class="full-signature-block toggleContainer"> 
//    <span class="toggle"> <i class="material-icons"></i> Full Signature </span> 
//    <div class="hiddenContent full-signature-usecase">
//     <h4 id="signature" class="signature"> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">zip</span><span class="tparams">[<span name="A1">A1 &gt;: <span class="extype" name="scala.collection.immutable.List.A">A</span></span>, <span name="B">B</span>, <span name="That">That</span>]</span><span class="params">(<span name="that">that: <a href="../GenIterable.html" class="extype" name="scala.collection.GenIterable">GenIterable</a>[<span class="extype" name="scala.collection.IterableLike.zip.B">B</span>]</span>)</span><span class="params">(<span class="implicit">implicit </span><span name="bf">bf: <a href="../generic/CanBuildFrom.html" class="extype" name="scala.collection.generic.CanBuildFrom">CanBuildFrom</a>[<a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>], (<span class="extype" name="scala.collection.IterableLike.zip.A1">A1</span>, <span class="extype" name="scala.collection.IterableLike.zip.B">B</span>), <span class="extype" name="scala.collection.IterableLike.zip.That">That</span>]</span>)</span><span class="result">: <span class="extype" name="scala.collection.IterableLike.zip.That">That</span></span> </span> </h4>
//    </div> 
//   </div>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---
