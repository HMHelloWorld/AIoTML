/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 */
$(function() {
	var modal = $('#aiotml-message-modal');
	var modalTitle = modal.find('.modal-title');
	var modalMessage = modal.find('pre.aiotml-message');
	
	$('div.aiotml-testcase-result').click(function(event) {
		var message = $(this).data('result-message');
		if (message) {
			modalTitle.text($(this).data('result-title')+' : '+$(this).data('result-error'));
			modalMessage.text(message);
			modal.modal('show');
		}
	});
});